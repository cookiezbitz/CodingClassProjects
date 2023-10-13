//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FirstLast
{
   public static String execute( String a, String b )
    {
        String smalla;
        String smallb;
        smalla = a.substring(0,1);
        smallb = b.substring(b.length()-1,b.length());
        
        return smalla+smallb;
    }
}