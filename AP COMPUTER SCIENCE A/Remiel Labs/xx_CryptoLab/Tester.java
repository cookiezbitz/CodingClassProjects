import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter a sentence that is to be encrypted: ");
        String sntnc = kbReader.nextLine( );
        System.out.println("Original sentence = " + sntnc);
        String encryptdSntnc = Crypto.encrypt(sntnc);
        System.out.println("Encrypted sentence = " + encryptdSntnc);
        String decryptdSntnc = Crypto.decrypt(encryptdSntnc);
        System.out.println("Decrypted sentence = " + decryptdSntnc);
        System.out.println("Encrypt has been called " + Crypto.getNumEncrypts() + " times and decrypt has been called " + Crypto.getNumDecrypts() + " times");
    }
}
