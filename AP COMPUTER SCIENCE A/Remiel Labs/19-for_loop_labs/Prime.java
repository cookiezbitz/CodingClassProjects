//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Prime
{
    public static boolean isPrime( int num )
    {
        for(int x = num-1; x>1; x--){
            if(num%x == 0){
                return false;
            }
        }
        return true;
    }
}