//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringStuff
{
    public static String firstlast(String thingy){

        return thingy.substring(0,1) + thingy.substring(thingy.length()-1,thingy.length());
    }

    public static boolean isSame(String thingy){
        if(thingy.substring(0,1).equals( thingy.substring(thingy.length()-1,thingy.length()))){
            return true;
        }
        return false;
    }

    public static String mid(String thingy){
        
        return thingy.substring(thingy.length()/2,(thingy.length()/2 + 1));
    }

}