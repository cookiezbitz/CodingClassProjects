//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BoxWord
{
    public static String go( String word )
    {
        String output="";
        for(int x = 0; x<word.length(); x++){
            for(int y=0; y<  word.length(); y++){
            if(x%word.length() == 0){
                output += word;
                break;
            }else if(y%word.length()==0){
                output += word.substring(x,x+1);
            }else {
                output += " ";
            }
                /*
                output += word.substring(x,x+1);
             if(x%word.length() == 0){
                 output += word.substring(1,word.length()-1);
                 //System.out.println("w");
             }else{
                 for(int e = 0; e<word.length()-2; e++)
                 output+= " ";
                 //System.out.println("2");
             }
             output += word.substring(word.length()-1,word.length());
            */
        }
        output += "\n";
            
        }
        return output+"\n";
    }
    
}