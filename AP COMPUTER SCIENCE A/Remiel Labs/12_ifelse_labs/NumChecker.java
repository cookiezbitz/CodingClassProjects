//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class NumChecker
{
    public static int check( int x )
    {
        int checks;

        if(x%5 == 1){
            checks=1;
        }
        else if(x%4 == 1){
            checks=2;
        }
        else if(x%3 ==1 ){
            checks=3;
        }
        else {
            checks=4;
        }
        return checks;

    }
}