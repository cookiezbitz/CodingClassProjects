//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FibonacciRunner
{
    public static void main(String args[])
    {
        Fibonacci f = new Fibonacci(15);
        f.toString();
        System.out.println("Your fibby number is " + f.getFib());
        System.out.println();
        System.out.println("apple");
        System.out.println();
        f.FibSetter(5);
        System.out.println("Your fibby number is " + f.getFib());
        f.toString();

        //add test cases
    }
}