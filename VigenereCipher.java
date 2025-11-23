public class VigenereCipher {

    public static String encrypt(String text, String key) {
        return process(text, key, true);
    }

    public static String decrypt(String text, String key) {
        return process(text, key, false);
    }

    private static String process(String text, String key, boolean encrypt) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        int keyIndex = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                int shift = key.charAt(keyIndex % key.length()) - 'A';
                int offset = encrypt ? shift : -shift;

                char newChar = (char) ((ch - base + offset + 26) % 26 + base);
                result.append(newChar);

                keyIndex++;
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
