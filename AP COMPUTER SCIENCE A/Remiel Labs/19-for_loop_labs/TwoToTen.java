//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class TwoToTen
{
    public static double getBaseTen( String bin )
    {
        double ten=0;
        for(int x = bin.length(); x > 0; x--){
            if(bin.substring(x-1,x).equals ("1")){
                ten += Math.pow(2,x);
            }
        }
        return ten;
    }
}