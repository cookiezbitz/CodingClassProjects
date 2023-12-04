//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFive
{
    public static String go( int amount, char letter )
    {
        String output="";
        char modled = letter;
        for(int lines = amount; lines >0; lines--){
        for(int x = 0; x < lines ; x++){
            for(int y = amount; y>x; y--){
            output += modled;
            }
            modled++;
            output += " ";
        }
        modled = letter;
        output += "\n";
    }
        return output;
    }
}