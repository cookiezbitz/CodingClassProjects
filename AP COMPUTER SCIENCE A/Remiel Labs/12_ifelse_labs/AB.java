//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class AB
{
    public static boolean check( String s, String a, String b)
    {
        String comb = a + b;
        for(int x = 1; x<s.length()-1; x++){
            System.out.println(comb);
            if(s.substring(x,x+2).equals(comb)){
                return true;
                
            }
        }
        
        return false;
    }
}