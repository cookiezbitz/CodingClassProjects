import java.util.Scanner;
import java.util. Arrays;

public class Arrays_Lab
{
    public static void main(String[] args) 
    {
        int[] rayOne = {1,4,5,3,22,5,99,-1,12,45,67,39};
        int totalofnum = 0;

        //1.) write a loop to print out every third number in the array (i.e. first, third, sixth, etc)
        System.out.println("Every third number");
        for(int i = 0; i < rayOne.length; i++){
            if(i%3 == 0){
                System.out.println(rayOne[i]);
            }

        }

        //2.) write a loop to print out all of the numbers backwards
        
        System.out.println("every number backwards");
        System.out.println(" ");
        for(int i = rayOne.length-1; i >= 0; i--){

            System.out.print(rayOne[i]);
            System.out.print("   ");

        }
        System.out.println("   ");

        //3.) write a loop to calculate the average of all the values in the array and print the result
        
        System.out.println("average of all values");
        for(int i = 0; i <= rayOne.length -1; i++){
            totalofnum = totalofnum + rayOne[i];
            
        }
        //System.out.println("TEST");
        System.out.println(totalofnum/rayOne.length);
        
    }
}
