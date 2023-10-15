//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Decoder
{
    public String deCode( char s )
    {
        char newchar = 23;
        String result;
        if(s>=97){
             newchar = Character.toUpperCase(s);
        }
        else if(s>= 65 && s< 97){
            newchar = Character.toLowerCase(s);
        } else if(s >= 48 && s < 58){
            
            s+=17;
            newchar = s;
        }

        
        result = Character.toString(newchar);
        return result;
    }
}