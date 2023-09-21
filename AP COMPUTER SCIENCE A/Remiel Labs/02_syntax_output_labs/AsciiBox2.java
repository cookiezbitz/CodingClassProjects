//(c) A+ Computer Science
//www.apluscompsci.com

public class AsciiBox2
{
    public static void main(String[] args)
    {
        System.out.println("name \t Remiel  date \t 9\\6 \n\n" );
        
        int boxlen = 16;
        
        
        for(int i = 0; i < boxlen + 1; i++){
            if(i < 2){
                System.out.println("++++++++++++++++++++++++++ " );
                
            }
            if( 2 < i && i < boxlen - 2){
                
                if( i == boxlen/2){
                    System.out.print("++math is hard, give up ");
                } else{
                System.out.println("++\t\t\t++ " );
            }
            }
            if( boxlen -2 <i && i < boxlen +1 ){
                System.out.println("++++++++++++++++++++++++++ " );
                
            }
            
        }
    }
    }
