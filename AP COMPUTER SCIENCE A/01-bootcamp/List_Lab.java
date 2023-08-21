import java.util.List;
import java.util.ArrayList;

public class List_Lab
{
        public static int bigList( ArrayList<Integer> list )
        {
            
    
            int big = 0;
            
            for( int x = 0; x < list.size(); x++){
                //System.out.println("TestSuccess");
                if(list.get(x) > big){
                    big = list.get(x);
                }
                }
            
    
            // find the biggest number in the list and return it
    
            return big;
        }

    public static void main(String[] args) 
    {
        int randomNum = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for(int y = 0; y < 30; y++){
            randomNum =(int)(Math.random() * 101);
            nums.add( randomNum );
            
        }
        // add 30 random numbers (between 1 and 100) to the list
        // use a loop and Math.random() (search it up!)
        System.out.println("Everything in the List");
        for(int w = 0; w < nums.size(); w++){
            System.out.println(nums.get(w));
        }
        // print out the list
        System.out.println();
        // this will take the list named "nums" and pass it into the function "bigList"
        int big = bigList(nums);
        System.out.println( "The largest value in the list is: " + big );     
    }
}
