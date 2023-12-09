//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
    private int[] array;
    
    public ArrayStats(String list)
    {
        Scanner c = new Scanner(list);
        int x = 0;
        while(c.hasNextInt()){
            x++;
            //array[x]  = c.nextInt();
        }
        System.out.println(" x is "  + x);
    }    
    
    public void setArray(String list)
    {
        //put stuff in the array        
    }    
            
    public int getNumGroupsOfSize(int size)
    {
        return -2938;
    }
    
    public String toString()
    {
        return "return the array as a string";
    }
}