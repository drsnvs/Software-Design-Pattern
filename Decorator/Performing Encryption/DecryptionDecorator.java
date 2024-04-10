import java.util.Map;

// Decorator for Decryption
class DecryptionDecorator implements TextOperation {
    private TextOperation textOperation;

    public DecryptionDecorator(TextOperation textOperation) {
        this.textOperation = textOperation;
    }

    @Override
    public String operate(String text) {
        // Implement decryption logic here
        // For simplicity, let's just shift characters back by 1 in ASCII
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            decryptedText.append((char) (c - 1));
        }
        return decryptedText.toString();
    }
}