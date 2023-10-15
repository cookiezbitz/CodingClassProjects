//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grade
{
    public static String getLetterGrade( int numGrade )
    {
        String grade = "";

        if(numGrade>90){
            grade = "A";
        }
        else if(numGrade>80){
            grade = "B";
        }
        else if(numGrade>70){
            grade = "C";
        }
        else if(numGrade>60){
            grade = "D";
        }
        else{
            grade = "F";
        }


        return grade;
    }
}