import java.io.*;
import java.util.*;

public class Crypto
{
    
    private static int encrypts = 0;
    private static int decrypts = 0;
    
    
    public static String encrypt(String s){
        encrypts++;
        String encrypted = "";
        for(int x = 0; x<s.length(); x++){
            if(s.substring(x,x+1).equals( "v")){
                encrypted += "ax’,r";
            }else if(s.substring(x,x+1).equals("m")){
                encrypted += "ssad";
            }else if(s.substring(x,x+1).equals("g")){
                encrypted += "je$..w";
            }else if(s.substring(x,x+1).equals( "b")){
                encrypted += "duh>?/";
            }
            else{
                encrypted+= s.substring(x,x+1);
            }
        }
        return encrypted;
    }
    
    public static String decrypt(String s){
        String decrypted = "";
        boolean looking = true;
        decrypts++;
        //find the encrypted letters and decrypt them at it's index
        
        while(looking){
            int x= 0;
            
            if(s.length() >= 4 && s.substring(x,x+4).equals("ssad")){
                decrypted += "m";
                s = s.substring(x+4);
            }else if(s.length() >= 5 && s.substring(x,x+5).equals("ax’,r")){
                decrypted += "v";
                s = s.substring(x+5);
            }else if(s.length() >= 6 && s.substring(x,x+6).equals("je$..w")){
                decrypted += "g";
                s = s.substring(x+6);
            }else if(s.length() >= 6 && s.substring(x,x+6).equals("duh>?/")){
                decrypted += "b";
                s = s.substring(x+6);
            }else{
                decrypted += s.substring(x,x+1);
                s = s.substring(x+1);
            }
            
            
            if(s.length() == 0){
                looking = false;
            }
        }
        
        return decrypted;
    }
    
    public static int getNumEncrypts(){
        return encrypts;
    }
        public static int getNumDecrypts(){
        return decrypts;
    }

    
    
    
}