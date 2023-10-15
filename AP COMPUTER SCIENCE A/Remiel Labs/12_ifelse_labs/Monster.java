//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class Monster
{
    private String name;
    private int howBig;    

    public Monster(String n, int size)
    {
        name = n;
        howBig = size;
    }

    public String getName()
    {
        return name;
    }
    
    public int getHowBig()
    {
        return howBig;
    }
    
    public boolean isBigger(Monster other)
    {
        if(howBig > other.getHowBig()){
        return true;
    }
    else return false;
    }
    
    public boolean isSmaller(Monster other)
    {
        if(isBigger(other)){
        return false;
    }
    else{
        return true;
    }
    }

    public boolean namesTheSame(Monster other)
    {
        if(name.equals(other.getName()))
            return true;
        else
        return false;
    
    }
    
    public String toString()
    {
        
        return name + " is " + howBig + " large";
    }
}