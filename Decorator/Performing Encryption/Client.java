public class Client {
    public static void main(String[] args) {
        String text = "This is a text for design pattern Darshan";

        // Creating plain text component
        TextOperation textComponent = new PlainText(text);

        // Decorating with encryption
        TextOperation encryptedTextComponent = new EncryptionDecorator(textComponent);
        System.out.println("Encrypted text: " + encryptedTextComponent.operate(text));

        // Decorating with decryption
        TextOperation decryptedTextComponent = new DecryptionDecorator(encryptedTextComponent);
        System.out.println("Decrypted text: " + decryptedTextComponent.operate(encryptedTextComponent.operate(text)));

        // Decorating with word count
        TextOperation wordCountTextComponent = new WordCountDecorator(textComponent);
        System.out.println("Word count: " + wordCountTextComponent.operate(text));
    }
}