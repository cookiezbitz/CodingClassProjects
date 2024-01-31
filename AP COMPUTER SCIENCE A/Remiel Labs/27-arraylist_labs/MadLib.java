//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
    private ArrayList<String> verbs;
    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;

    public MadLib(String fileName)
    {
        // initialize instance variables
        
        //load stuff
        
        try{
            // load the story
            Scanner file = new Scanner(new File(fileName));

            // build the story, replacing special characters with noun/verb/adj
            
        }
        catch(Exception e){
            out.println("Houston we have a problem!");
        }		
    }

    public void loadNouns()
    {
        try{		
            //add code here
            Scanner file = new Scanner(new File("nouns.txt"));
            while (file.hasNext()) {
                nouns.add(file.next());
            }
        }
        catch(Exception e)
        {
        }			
    }

    public void loadVerbs()
    {
        try{	
            //add code here
        }
        catch(Exception e)
        {
        }
    }

    public void loadAdjectives()
    {
        try{
            //add code here	
        }
        catch(Exception e)
        {
        }
    }

    public String getRandomVerb()
    {
        return "";
    }

    public String getRandomNoun()
    {
        return "";
    }

    public String getRandomAdjective()
    {
        return "";
    }		

    public String toString()
    {
        return "\n\n\n";
    }
}