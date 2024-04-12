import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionContext {
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