import java.util.Map;

// Decorator for Encryption
class EncryptionDecorator implements TextOperation {
    private TextOperation textOperation;

    public EncryptionDecorator(TextOperation textOperation) {
        this.textOperation = textOperation;
    }

    @Override
    public String operate(String text) {
        // Implement encryption logic here
        // For simplicity, let's just shift characters by 1 in ASCII
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            encryptedText.append((char) (c + 1));
        }
        return encryptedText.toString();
    }
}