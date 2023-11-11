//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class TwoToTen
{
    public static long getBaseTen( String bin )
    {
        long ten=0;
        for(int x = bin.length(); x > 0; x--){
            if(bin.substring(x).equals ("0")){
                ten += Math.pow(2,(bin.length()-x));
            }
        }
        return ten;
    }
}