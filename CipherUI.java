import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CipherUI extends JFrame {

    private JTextArea inputArea;
    private JTextArea outputArea;
    private JTextField keyField;

    public CipherUI() {
        setTitle("Vigenère Cipher Tool");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("Vigenère Cipher Encryption Tool", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        add(title, BorderLayout.NORTH);

        // Center panel
        JPanel center = new JPanel(new GridLayout(1, 2, 10, 10));

        inputArea = new JTextArea();
        inputArea.setBorder(BorderFactory.createTitledBorder("Input Text"));
        center.add(new JScrollPane(inputArea));

        outputArea = new JTextArea();
        outputArea.setBorder(BorderFactory.createTitledBorder("Output Text"));
        outputArea.setEditable(false);
        center.add(new JScrollPane(outputArea));

        add(center, BorderLayout.CENTER);

        // Bottom panel
        JPanel bottom = new JPanel(new GridLayout(2, 1, 5, 5));

        JPanel keyPanel = new JPanel();
        keyPanel.add(new JLabel("Key: "));
        keyField = new JTextField(15);
        keyPanel.add(keyField);
        bottom.add(keyPanel);

        JPanel buttonPanel = new JPanel();
        JButton encryptBtn = new JButton("Encrypt");
        JButton decryptBtn = new JButton("Decrypt");
        JButton copyBtn = new JButton("Copy Output");
        JButton clearBtn = new JButton("Clear");

        buttonPanel.add(encryptBtn);
        buttonPanel.add(decryptBtn);
        buttonPanel.add(copyBtn);
        buttonPanel.add(clearBtn);

        bottom.add(buttonPanel);
        add(bottom, BorderLayout.SOUTH);

        // Button actions
        encryptBtn.addActionListener(this::encryptText);
        decryptBtn.addActionListener(this::decryptText);
        copyBtn.addActionListener(e -> {
            String output = outputArea.getText();
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new java.awt.datatransfer.StringSelection(output), null);
        });
        clearBtn.addActionListener(e -> {
            inputArea.setText("");
            outputArea.setText("");
            keyField.setText("");
        });

        setVisible(true);
    }

    private void encryptText(ActionEvent e) {
        String text = inputArea.getText();
        String key = keyField.getText();

        if (key.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Key cannot be empty!");
            return;
        }

        outputArea.setText(VigenereCipher.encrypt(text, key));
    }

    private void decryptText(ActionEvent e) {
        String text = inputArea.getText();
        String key = keyField.getText();

        if (key.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Key cannot be empty!");
            return;
        }

        outputArea.setText(VigenereCipher.decrypt(text, key));
    }
}
