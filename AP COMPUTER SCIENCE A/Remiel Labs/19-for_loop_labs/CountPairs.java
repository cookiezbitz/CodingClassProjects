//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class CountPairs
{
    public static int pairCounter( String str )
    { 
        int count = 0;
        for(int indsexy = 0; indsexy<str.length()-1; indsexy++){
            if(str.substring(indsexy, indsexy+1).equals(str.substring(indsexy+1, indsexy+2))){
                count++;
            }
        }
        return count;
    }
}