import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Helper {
    public static String getSHA256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            // acabar com valores hexadecimais e não bytes
            StringBuffer hexadecimalString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);
                hexadecimalString.append(hexadecimal);
            }
            return hexadecimalString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
