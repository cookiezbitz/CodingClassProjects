//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LeaveOutRunner
{
    public static void main( String args[] )
    {
        LeaveOut s = new LeaveOut();        
        System.out.println( s.out( "dog",1 ) ) ;
        System.out.println( s.out( "aplus",2 ) ) ;
        System.out.println( s.out( "catgiraffe",3 ) ) ;
        System.out.println( s.out( "ap",1 ) ) ;
        System.out.println( s.out( "pluscat",4 ) ) ;
        System.out.println( s.out( "aplusdog#13337#",9 ) ) ;
        System.out.println( s.out( "code",2 ) ) ;
        System.out.println( s.out( "wow",1 ) ) ;
        System.out.println( s.out( "catsand",0 ) ) ;    
    }
}