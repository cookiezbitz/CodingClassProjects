//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class NumberSearchRunner
{
    public static void main( String args[] )
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
        int find = 5;
        System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");
        int[] array2 = {10, 30, 20, 40, 50, 15};
        find =12;
        System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array2, find) + "\n");
        //add more case
    }
}

