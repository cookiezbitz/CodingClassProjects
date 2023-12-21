//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Fibonacci
{
    //instance variable
    int size;
    int fibon[];
    public Fibonacci (int s){
        size = s;
        fibon = new int[size];
    }

    //constructors

    //set method
    
    public void FibSetter(int set){
        size = set;
        fibon = new int[size];
    }

    //get method
    public int getFib(){
        int fibby = 0;
        fibon[0] = 0;
        fibon[1] = 1;
        for(int i = 2; i< fibon.length; i++){
            fibon[i] = fibon[i-2] + fibon[i-1];
        }
        fibby = fibon[fibon.length-1];
        
        return fibby;
    }
    
    public String toString(){
        return "Your fibby number is " + getFib();
    }
    //toString
}