import java.util.Scanner;

public class String_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter a word :: ");
        String word = kb.next();

        //initiate variable
        int longword = word.length();
        int wordsprocessed = 1;
        int wordledwordle = longword - wordsprocessed;
        String lastletter;

        System.out.println(word.substring(longword-1) + word.substring(0,1));
        //1.) print out the last and then the first letter of the word

        //2.) print out the word in reverse (if word is "hello" then print "olleh")

        for(int i = word.length()-1; i >= 0; i--){

            System.out.print(word.substring(i, i+ 1));

        }
        System.out.println(" ");

        /*
        while(longword != wordsprocessed){
        int x = 1;
        System.out.print(word.substring(longword - x));
        wordsprocessed++;
        x++;

        }
         */
        //3.) check to see if the word contains at least one vowel (a/e/i/o/u) and print out the result
        System.out.println("TEST");
        if(word.contains("a")){
            System.out.print("a");
        }
        if(word.contains("e")){
            System.out.print("e");
        }
        if(word.contains("i")){
            System.out.print("i");
        }
        if(word.contains("o")){
            System.out.print("o");
        }
        if(word.contains("u")){
            System.out.print("u");
        }

    
    }
}
