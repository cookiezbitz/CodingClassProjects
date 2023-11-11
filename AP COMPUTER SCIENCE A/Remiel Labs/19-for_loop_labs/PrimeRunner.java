//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class PrimeRunner
{
    public static void main ( String[] args )
    {
        Prime pp = new Prime();
        int num = 90;
        //int num = 7;
        if(pp.isPrime(num)){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " no es primo");
        }
    }    
}