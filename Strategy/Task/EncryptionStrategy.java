import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Define abstract encryption strategy
interface EncryptionStrategy {
    String encrypt(String data) throws NoSuchAlgorithmException;
}

// Concrete implementation of encryption using MD5
class MD5Encryption implements EncryptionStrategy {
    @Override
    public String encrypt(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(data.getBytes());
        byte[] digest = md.digest();
        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }
}

// Concrete implementation of encryption using SHA-256
class SHA256Encryption implements EncryptionStrategy {
    @Override
    public String encrypt(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(data.getBytes());
        byte[] digest = md.digest();
        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }
}

// Context class that uses the encryption strategy
class EncryptionContext {
    private EncryptionStrategy strategy;

    public EncryptionContext(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encryptData(String data) throws NoSuchAlgorithmException {
        return this.strategy.encrypt(data);
    }
}

// Example usage
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Create different encryption strategies
        EncryptionStrategy md5Strategy = new MD5Encryption();
        EncryptionStrategy sha256Strategy = new SHA256Encryption();

        // Use MD5 encryption
        EncryptionContext context = new EncryptionContext(md5Strategy);
        String encryptedDataMD5 = context.encryptData("Hello, world!");
        System.out.println("MD5 Encrypted: " + encryptedDataMD5);

        // Change strategy to SHA-256 encryption
        context.setStrategy(sha256Strategy);
        String encryptedDataSHA256 = context.encryptData("Hello, world!");
        System.out.println("SHA256 Encrypted: " + encryptedDataSHA256);
    }
}
