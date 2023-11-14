//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class JavaLoopLabRunner
{
	public static void main( String args[] )
	{
		int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222 };
		
		//uncomment the class you need to test 
		//as you need to test them
		
		
		DigitCounter s1 = new DigitCounter();
		CountEvens s2 = new CountEvens();
		CountOdds s3 = new CountOdds();
				
				
		for( int val : cases )
		{
			System.out.println( s1.go( val ) );
			System.out.println( s2.go( val ) );
			System.out.println( s3.go( val ) );
		}
	}
}