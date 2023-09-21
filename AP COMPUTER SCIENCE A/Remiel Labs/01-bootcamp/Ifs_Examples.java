import java.util.Scanner;

public class Ifs_Examples
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter an integer :: ");
        int num = kb.nextInt(); // wait for someone to input something
        System.out.println (num);

        if( num > 10 ) // checks if num is greater than 10
        {
            System.out.println( " > 10 " );
        }
        else
        {
            System.out.println( " not > 10 ");
        }
        if( num < 10 )
        {
            System.out.println( " < 10 " );
        }
        else
        {
            System.out.println( " not < 10 ");
        }

        if (num == 10)
        {
            System.out.println (" equals 10 ");
        }
        else
        {
            System.out.println( " does not equal 10 ");
        }

    }
}
