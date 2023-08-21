import java.util.Scanner;
import java.util. Arrays;

public class Matrices_Examples
{
    public static void main(String[] args) 
    {
        int[][] mat = {{2,3,4},
                       {55,66,77},
                       {23,110, 44}};

        System.out.println( Arrays.toString( mat[2] ));
        System.out.println( Arrays.toString( mat[1] ));
        System.out.println( Arrays.toString( mat[0] ));

        System.out.println( mat[0][0] );
        System.out.println( mat[2][1] );
        System.out.println( mat[1][2] );
        
        System.out.println(mat.length);
        System.out.println(mat[0].length);

        for( int[] row : mat )
        {
            for( int item : row )
            {
                System.out.print( item + " " );
            }
            System.out.println();
        }
        
        for (int r = 0; r < mat.length; r++)
        {
            for (int c = 0; c < mat[0].length; c++)
            {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }

    }
}
