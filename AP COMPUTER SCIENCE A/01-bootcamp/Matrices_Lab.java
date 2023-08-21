import java.util.Scanner;
import java.util.Arrays;

public class Matrices_Lab
{
    public static int avgMat( int[][] matty )
    {
        int sum = 0; // the current sum
        int avg = 0; // avg to return
        int numItems = 0; // total number of items in the matrix
        
        for(int i = 0; i < matty.length; i++){
            for(int w = 0; w < matty[i].length; w++){
                sum += matty[i][w];
                numItems++;
            }
            
        }
        avg = sum/numItems;
        // find the average of all the values from the matrix (named "matty")
        // store it in avg
        // return avg

        return avg;
    }

    public static void main(String[] args) 
    {
        int[][] mat = {{ 1, 5, 7},
                       {19,32,76},
                       {11,23,99},
                       {54,78,39}};

        // this will take "mat" and give it to the function "avgMat"
        int avg = avgMat(mat);
        System.out.println( "The average is " + avg );       
    }
}
