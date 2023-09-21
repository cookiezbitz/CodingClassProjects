import java.util.Scanner;
import java.util. Arrays;

public class Arrays_Examples
{
    public static void main(String[] args) 
    {
        int[] numArray = {2,3,4,5,6,7,8,9,0,11,2,3,4,5,3};

        System.out.println( Arrays.toString( numArray ) );

        System.out.println( numArray[0] );

        System.out.println( "length == " + numArray.length );

        numArray[3] = 999;

        numArray[ 7 / 3 ] = 90;

        for( int item : numArray )
        {
            System.out.print( item + " " );
        }
    }
}
