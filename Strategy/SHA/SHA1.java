import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1 implements StrategyClass{
	public void encode(String input){
		try {
			MessageDigest md = MessageDigest.getInstance("SHA1");

			md.update(input.getBytes());

			byte[] hashBytes = md.digest();

			StringBuilder hexString = new StringBuilder();
			for (int i = 0; i < hashBytes.length; i++) {
				String hex = Integer.toHexString(0xff & hashBytes[i]);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}

			System.out.println("SHA-256 Hash: " + hexString.toString());
		} catch (NoSuchAlgorithmException e) {
			System.err.println("Error: SHA-256 algorithm not found.");
			e.printStackTrace();
		}
	}
}