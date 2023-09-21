import java.util.List;
import java.util.ArrayList;

public class List_Examples
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add( 10 );
        nums.add( 30 );
        nums.add( 40 );

        System.out.println( nums );
        System.out.println( "size == " + nums.size() );

        nums.add( 0, 99 );
        nums.add( 7 );
        System.out.println( nums.get( 0 ) );
        System.out.println( nums );

        nums.set( 0, 101 );
        System.out.println( nums );   

        nums.remove( 2 );
        System.out.println( nums );  

        for( int item : nums )    
        {
            System.out.print( item + " " ); 
        }
    }
}
