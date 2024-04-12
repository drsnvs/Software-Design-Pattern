import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Example usage
public class Client {
    public static void main(String[] args){
		try{
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
		}catch(Exception e){
			e.printStackTrace();
		}
    }
}