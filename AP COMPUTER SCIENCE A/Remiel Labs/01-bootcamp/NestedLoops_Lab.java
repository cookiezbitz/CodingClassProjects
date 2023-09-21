import java.util.Scanner;

public class NestedLoops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter the size of the triangle :: ");
        int size = kb.nextInt();
        int row = 0;
        int column = 0;
        row = size;
        

        
        for( int i = 0; i < row; i++)
        {
            for( int j = 0; j < row-column; j++ )
            {
                System.out.print( "@" );
            }
            column++;
            System.out.println();
        }
        }
        
        }

        // write nested loops that will print out an
        // isosceles right triangle (if you don't know what that is you should drop this class immediately!!!!!)
        // of at signs (@) based on the size
        // for example, if size is 3, you would print:
        // @@@
        // @@
        // @
    
