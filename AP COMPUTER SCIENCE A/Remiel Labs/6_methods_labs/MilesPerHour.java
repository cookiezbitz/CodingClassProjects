//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MilesPerHour
{
    public static double getMPH( int dist, int hrs, int mins )
    {
        
        double time = hrs + (double)mins/60;
        double mph = (double)dist/time;
        
        return mph;
    }
}

