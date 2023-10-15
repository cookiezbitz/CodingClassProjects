//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringFirstLetterCheck
{
    
    public static boolean checkFirstLetter( String wordOne, String wordTwo )
    {
        boolean yes;
        if(wordOne.substring(0,1).equals(wordTwo.substring(0,1))){
            System.out.println(wordOne + " has the same first letter as " + wordTwo);
            return true;
        }else{
        System.out.println(wordOne + " does not have the same first letter as " + wordTwo);
        return false;
        
    }
}
}