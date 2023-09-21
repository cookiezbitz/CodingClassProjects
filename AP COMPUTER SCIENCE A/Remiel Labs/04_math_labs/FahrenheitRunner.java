//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

public class FahrenheitRunner
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner( System.in );
        System.out.print( "Enter the fahrenheit value :: " );
        double f = kb.nextDouble();
        
        System.out.println((f-32)*(5.0/9));
        
        //print your answer here
        
    }
}

/*
 
Sample Data: 
98.6
52.30
82.45
75.00
100.00

Sample Output : 
37.00 degrees Celsius
11.28 degrees Celsius
28.03 degrees Celsius
23.89 degrees Celsius
37.78 degrees Celsius


*/
