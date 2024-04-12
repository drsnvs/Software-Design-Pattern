import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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