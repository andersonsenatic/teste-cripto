
import javax.crypto.Cipher;
import javax.crypto.Mac;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;

public class CryptoTest {

    public static void main(String[] args) throws Exception {

        // Criptografia simétrica
        Cipher.getInstance("AES/GCM/NoPadding");
        Cipher.getInstance("AES/CBC/PKCS5Padding");

        // Criptografia assimétrica
        KeyPairGenerator.getInstance("RSA");
        KeyPairGenerator.getInstance("EC");

        // Assinaturas digitais
        Signature.getInstance("SHA256withRSA");
        Signature.getInstance("SHA256withECDSA");

        // Hash
        MessageDigest.getInstance("SHA-256");
        MessageDigest.getInstance("SHA-1");

        // Autenticação
        Mac.getInstance("HmacSHA256");

        System.out.println("CBOM Cryptographic Discovery Lab");
    }
}
