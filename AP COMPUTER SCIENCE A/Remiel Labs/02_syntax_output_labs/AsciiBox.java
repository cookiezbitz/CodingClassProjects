//(c) A+ Computer Science
//www.apluscompsci.com

public class AsciiBox
{
    public static void main(String[] args)
    {
        System.out.println("name \t Remiel  date \t 9\\6 \n\n" );
        
        int boxlen = 15;
        
        
        for(int i = 0; i < boxlen; i++){
            if(i%4 == 1){
            System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBB " );
        }
        else{
            System.out.println("+++++++++++++++++++++++++ " );
        }
    }
    }
}