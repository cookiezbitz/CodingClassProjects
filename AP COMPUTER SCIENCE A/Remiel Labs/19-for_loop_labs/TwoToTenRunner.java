//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class TwoToTenRunner
{
    public static void main ( String[] args )
    {
        TwoToTen b = new TwoToTen();
        String nums = "1010101010110";
        System.out.println(nums + " == " + b.getBaseTen(nums));
    }
}