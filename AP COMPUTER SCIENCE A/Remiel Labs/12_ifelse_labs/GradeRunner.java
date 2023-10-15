//(c) A+ Computer Science
// www.apluscompsci.com
//Name -
import java.util.Scanner;
public class GradeRunner
{
    public static void main( String args[] )
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("gimmie your % grade :: ");
        int percent = kb.nextInt();
        System.out.println( Grade.getLetterGrade( percent ) );
        //add test cases
    }
}