import java.util.Scanner;

public class Loops_Examples
{
    public static void main(String[] args) 
    {
        int x = 10;
        
        while ( x != 120 )
        {
            System.out.println( x );
            x = x + 2;
        }

        for( int y = 20; y > 5; y -= 2 )
        {
            System.out.print( y + " "  );
        }

    }
}
