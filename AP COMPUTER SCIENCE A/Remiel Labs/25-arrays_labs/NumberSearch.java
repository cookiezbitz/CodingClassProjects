//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class NumberSearch
{
    public static int getNextLargest(int[] numArray, int searchNum)
    {
        int nextLargest = Integer.MAX_VALUE;;
        int prevNextLargest = 0;
        int diff = Integer.MAX_VALUE;
        int diff2 = 0;
        for( int x = 0; x < numArray.length; x++){

            if(numArray[x] > searchNum){

                int currentDiff = numArray[x] - searchNum;
                if (currentDiff < diff) {
                    nextLargest = numArray[x];
                    diff = currentDiff;
                }
            }
        }

        return nextLargest;
    }
}