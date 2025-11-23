Vigenere Cipher Tool

A simple Java-based application that implements the Vigenère Cipher, one of the classic polyalphabetic encryption techniques.
This project includes both a command-line interface and a Java Swing GUI, making it easy to encrypt and decrypt messages using a secret key.

📁 Project Structure
VigenereCipherTool/
│
├── VigenereCipher.java     # Core logic for encryption & decryption
├── CipherUI.java           # Java Swing GUI for interactive usage
└── App.java                # CLI entry point to test the cipher

✨ Features

Encrypt text using the Vigenère Cipher

Decrypt an encrypted message

Clean and reusable encryption logic class

Simple and interactive GUI built with Swing

CLI version for quick testing

🧠 How the Vigenère Cipher Works

Uses a keyword to shift letters

Each character of the key determines a shift amount

Alphabet wraps around (A → Z)

Non-alphabetic characters remain unchanged

Example:
Text: HELLO
Key: KEY
Encrypted: RIJVS

🚀 Getting Started
1. Clone the repository
git clone https://github.com/<your-username>/VigenereCipherTool.git
cd VigenereCipherTool

2. Compile the files
javac *.java

3. Run the project
GUI
java CipherUI

CLI
java App

🖥️ Screenshots (Optional)

Add screenshots if you want to showcase the UI

🛠️ Technologies Used

Java 17 (or any compatible version)

Java Swing (GUI)

OOP concepts

📚 Learning Outcomes

String manipulation in Java

GUI development using Swing

Classical cryptography fundamentals

Clean code and class separation

🤝 Contributing

Pull requests and suggestions are welcome!

📜 License

This project is open-source under the MIT License.

👨‍💻 Author
Aditya Isadkar

GitHub: @adityaisadkar
LinkedIn: @LinkedIn
Email: adityaisadkar940@gmail.com