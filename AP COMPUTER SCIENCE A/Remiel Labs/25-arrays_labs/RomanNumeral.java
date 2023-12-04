//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral
{
    private Integer number;
    private String roman;

    private final static int[] NUMBERS= {1000,900,500,400,100,90,
            50,40,10,9,5,4,1};

    private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
            "L","XL","X","IX","V","IV","I"};

    public RomanNumeral(String str)
    {
        roman = str;


    }

    public RomanNumeral(Integer orig)
    {
        number = orig;


    }

    public void setNumber(Integer num)
    {
        number = num;



    }
    public void setRoman(String rom)
    {
        roman = rom;


    }

    public Integer getNumber()
    {
        String newRoman = roman;
        int newNumber = 0;
        int index = 0;
        while (!newRoman.equals("")) {
            if (newRoman.startsWith(LETTERS[index])) {
                newNumber += NUMBERS[index];
                newRoman = newRoman.substring(LETTERS[index].length());
            } else {
                index++;
            }
        }
        return newNumber;
    }

    public String toString()
    {
        int newNum = number;
        String newRoman = "";
        while(newNum != 0){
            for( int x = 0; x<NUMBERS.length; x++){
                if(newNum > NUMBERS[x] || newNum == NUMBERS[x]){
                    newRoman += LETTERS[x];
                    newNum -= NUMBERS[x];
                    break;
                }

            }
        }
        setRoman(newRoman);
        return roman + "\n";
    }
}