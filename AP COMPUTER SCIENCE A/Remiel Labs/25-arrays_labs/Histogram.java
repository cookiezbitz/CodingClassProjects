//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner; 

public class Histogram
{
    private int[] numCount;

    public Histogram(String line, int size )
    {
        numCount = new int[size];
        Scanner c = new Scanner(line);
        while (c.hasNextInt()) {
            int index = c.nextInt();
            if (index < size) {
                numCount[index] += 1;
            }
        }
    }

    public int   getMax()
    {
        int maximus = 0;
        for(int pig = 0; pig < numCount.length; pig++){
            if(numCount[pig] > maximus){
                maximus = numCount[pig];
            }
        }
        return maximus;
    }

    public String toString()
    {
        String output= "";
        for(int pig = 0; pig < numCount.length; pig++){
            output += pig + " - " + numCount[pig] + " | ";
        }
        return output;
    }
}