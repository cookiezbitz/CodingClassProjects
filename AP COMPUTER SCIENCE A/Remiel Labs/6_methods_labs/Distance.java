//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Distance
{
    public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
    {
        double distance = 
        Math.sqrt(Math.pow(xTwo-xOne,2) + Math.pow(yTwo-yOne,2));
        
        return distance;    
    }
}