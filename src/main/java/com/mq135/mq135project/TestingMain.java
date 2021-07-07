package com.mq135.mq135project;
import com.github.mervick.aes_everywhere.Aes256;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Base64;

public class TestingMain {
    public static void main(String[] args) throws Exception {
        String text = "TEXT";
        String pass = "PASSWORD";

        byte[] text_bytes = text.getBytes(StandardCharsets.UTF_8);
        byte[] pass_bytes = pass.getBytes(StandardCharsets.UTF_8);

        // strings encryption
        String encrypted = Aes256.encrypt(text, pass);
        // System.out.println(encrypted);

        // bytes encryption
        byte[] encrypted_bytes = Aes256.encrypt(text_bytes, pass_bytes);
        // System.out.println(Arrays.toString(encrypted_bytes));

        // strings decryption
        String decrypted = Aes256.decrypt(encrypted, pass);
        // System.out.println(decrypted);

        // bytes decryption
        byte[] decrypted_bytes = Aes256.decrypt(encrypted_bytes, pass_bytes);
        // System.out.println(Arrays.toString(decrypted_bytes));
        String code = "eyJpc28iOiJjbyIsImVuY19kYXRhIjogIlUyRnNkR1ZrWDE4OFFkQUY5YjB6UFZnSXFDM2FKc0Y5RTBsamhZbTFJTE53R3pzUUROU0JmL01GVDh0V2Z4cW4iLCJwb3NpdGlvbiI6W3sibGF0IjotMzMuNDE3MzkzOSwibG5nIjotNzAuNTgwNDk2Mn1dLCJsb2NhbGUiOiJlcyIsInRpbWVfem9uZSI6IlNhbnRpYWdvIiwiZGF0YSI6eyJhcGlfa2V5IjoiYWJmMjM3ODgtZGE2Zi00Yjc2LThiYWQtYzhhY2ViOTAzMGE2In19";
        String s = new String(Base64.getDecoder().decode(code), StandardCharsets.UTF_8);
        System.out.println(s);
        System.out.println(Aes256.decrypt("U2FsdGVkX188QdAF9b0zPVgIqC3aJsF9E0ljhYm1ILNwGzsQDNSBf/MFT8tWfxqn", "e24cd588-cb46-43d0-98c7-fc4c1ea30885"));
    }
}
