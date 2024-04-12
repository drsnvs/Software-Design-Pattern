import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 implements StrategyClass{
	public void encode(String input){
		try {
            MessageDigest md = MessageDigest.getInstance("MD5");

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

            System.out.println("MD5 Hash: " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: MD5 algorithm not found.");
            e.printStackTrace();
        }
	}
}