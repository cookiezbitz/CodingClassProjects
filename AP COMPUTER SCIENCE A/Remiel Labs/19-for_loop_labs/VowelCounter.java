//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class VowelCounter
{
    public static String getNumberString( String s)
    {
        String funny = "";
        String wordy = "";
        int numby = -1;
        for(int x = 0; x<s.length(); x++){
            wordy = s.substring(x,x+1);
            if(wordy.equals("a") || wordy.equals("e") ||wordy.equals("i") || wordy.equals("o") || wordy.equals("u")){
                numby++;
                funny += numby;
            }else{
                funny += wordy;
            }
            while(!(numby<9)){
                numby = -1;
            }
            
        }
        return funny;
    }
}


