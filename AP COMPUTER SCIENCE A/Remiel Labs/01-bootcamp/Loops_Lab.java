import java.util.Scanner;

public class Loops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter a start number :: ");
        int numOne = kb.nextInt();
        

        System.out.print( "Enter an end number :: ");
        int numTwo = kb.nextInt();
        
        
        while( numOne <= numTwo){
            System.out.println(numOne);
            numOne++;
            
        }
        // write a loop that will print out all of the numbers from numOne to numTwo (inclusive of both)
        // your code should be able to handle numOne < numTwo AND numOne > numTwo
    }
}
