//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FirstLastRunner
{
    public static void main( String args[] )
    {
        FirstLast s = new FirstLast();        
        System.out.println( s.execute( "dog", "cats" ) ) ;
        System.out.println( s.execute( "aplus", "pigs" ) ) ;
        System.out.println( s.execute( "catgiraffe", "apluscompsci" ) ) ;
        System.out.println( s.execute( "ap", "aplus" ) ) ;
        System.out.println( s.execute( "pluscat", "dogsaplus" ) ) ;
        System.out.println( s.execute( "#", "#" ) ) ;
        System.out.println( s.execute( "aplusdog#13337#", "pigaplusprogram" ) ) ;
        System.out.println( s.execute( "code", "code1234" ) ) ;
        System.out.println( s.execute( "wow", "eplus" ) ) ;
        System.out.println( s.execute( "catsand" , "aplusdogsaplus" ) ) ;
        System.out.println( s.execute( "7", "77777" ) ) ;        
    }
}