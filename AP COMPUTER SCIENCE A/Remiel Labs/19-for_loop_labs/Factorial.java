//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Factorial
{
    public static long getFactorial( int num )
    {
        long factorial=1;
        for( int x = 0; x < num ; x++){
            factorial *= (num-x);
        }
        return factorial;
    }
}