import java.util.Scanner;

public class Ifs_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Please enter an integer :: ");
        int num1 = kb.nextInt();
        if(num1 >= 200)
        {
            System.out.println(num1 + " >= 200");
                // write an if statement to print out if the number is greater than or equal to 200
        }
        else{
            System.out.println(num1 + " <= 200");
        }
        System.out.print( "Enter an integer :: ");
        int num2 = kb.nextInt();
        
        if(num2 % 2 == 0){
         System.out.println(num2 + " is even" );  
        }
        else{
            System.out.println(num2 + " is odd");
            
        }
        }
        

        // write an if statement to print out if the number is odd or even
        // you will need to use % (mod) to get the remainder of division
    }

