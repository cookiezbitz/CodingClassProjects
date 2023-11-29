//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleThree
{
    public static String go( int size, String let )
    {
        String output="";
        for( int i = 0; i<size; i++){
            for(int j = size-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j = i; j >= 0; j--){
                System.out.print(let);
            }
            System.out.println();
        }
        return output+"\n";

    }
}