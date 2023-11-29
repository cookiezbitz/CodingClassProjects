//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
    private String word;

    public TriangleWord(String w)
    {
        word=w;
    }

    public String toString()
    {
        String output="";
        for(int i = word.length(); i>0; i--){
            for(int j = 0; j < i; j++){
                output += " ";
            }
            output += word.substring(i-1,i);

            for(int j = word.length(); j-i>0; j--){
                output += "  ";
            }
            if(i<3){
                output += word.substring(i-1,i);
            }
            output+="\n";
        }
        return output+"\n";
    }
}