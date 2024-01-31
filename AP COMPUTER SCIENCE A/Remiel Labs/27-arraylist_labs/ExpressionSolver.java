//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
    //add in instance variables
    private ArrayList<String> exp;

    public ExpressionSolver(String s)
    {
        setExpression(s);
    }

    public void setExpression(String s)
    {
        // forw
        exp = new ArrayList<String>();        
        for(int i = 0; i<s.length(); i++){
            exp.add(s.substring(i,i+1));
            i++;
        }     
    }

    public void solveExpression()
    {
        int lop;
        int rop;
        int ans;
        // deal with multiply/divide
        for(int i = 0; i<exp.size(); i++){
            //see if thee thing is multiply or divide
            //check to see
            if(exp.get(i).equals("*") || exp.get(i).equals("/")){
                //execute the command
                lop = Integer.parseInt(exp.get(i-1));
                rop = Integer.parseInt(exp.get(i+1));
                //check if it's * or /
                if(exp.get(i).equals("*")){
                    ans = lop*rop;
                }else{
                    ans = lop/rop;
                }
                
                //store the answer
                exp.set(i-1, "" + ans);
                exp.remove(i);
                exp.remove(i);
                
            }
        }//donee with */
        
        for(int i = 0; i<exp.size(); i++){
            //see if thee thing is + or -
            //check to see
            if(exp.get(i).equals("+") || exp.get(i).equals("-")){
                //execute the command
                lop = Integer.parseInt(exp.get(i-1));
                rop = Integer.parseInt(exp.get(i+1));
                //check if it's + or -
                if(exp.get(i).equals("+")){
                    ans = lop+rop;
                }else{
                    ans = lop-rop;
                }
                
                //store the answer
                exp.set(i-1, "" + ans);
                exp.remove(i);
                exp.remove(i);
                
            }
        }//donee with */
        
        
            
            /*
            if(exp.indexOf("*") != -1 && exp.indexOf("/") != -1){
                if(exp.indexOf("*") > exp.indexOf("/")){
                    //if multiply comess first, do it first
                    exp.set(exp.get(exp.indexOf("*")-1),parseInt(exp.get(exp.indexOf("*")-1)) * parseInt(exp.get(exp.indexOf("*")+1)));

                }
                else{
                    //if divide comes first,do it first
                }
            }
        }

        //PEMDAS
        */

    }

    public String toString( )
    {
        return exp.toString();
    }
}