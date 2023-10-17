//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class StringRunner
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        StringStuff s = new StringStuff();
        System.out.println("Enter a word :: ");
        String word = keyboard.next();
        System.out.println("has first last letters :: " + s.firstlast(word));
        System.out.println("has middle letter:: " + s.mid(word));
        System.out.println("has same first and last letter :: " + s.isSame(word));
        
        // add test cases for your code here
    }
}