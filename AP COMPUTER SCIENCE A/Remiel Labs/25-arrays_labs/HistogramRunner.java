// (c)A+ Computer Science
// www.apluscompsci.com
// Name -
// Date -

public class HistogramRunner
{
	public static void main(String args[])
	{
		Histogram hist = new Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3", 8);
		System.out.println( hist );
		System.out.println( hist.getMax() );
		
		System.out.println("");
		
		hist = new Histogram("1 1 1 1 1 1 5 3 3 3 5 5 3", 6);
		System.out.println( hist );
		System.out.println( hist.getMax() );		
	}
}

/*
expected output

0 - 0 | 1 - 1 | 2 - 1 | 3 - 3 | 4 - 2 | 5 - 7 | 6 - 0 | 7 - 0 |
0 - 0 | 1 - 1 | 2 - 4 | 3 - 4 | 4 - 2 | 5 - 5 | 6 - 0 | 7 - 0 |
5

0 - 0 | 1 - 6 | 2 - 0 | 3 - 4 | 4 - 0 | 5 - 3 |
0 - 7 | 1 - 3 | 2 - 3 | 3 - 4 | 4 - 10203 | 5 - 13 |
4

*/