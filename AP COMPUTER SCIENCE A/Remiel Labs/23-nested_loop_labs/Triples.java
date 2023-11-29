//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
 
public class Triples
{
   private int number;

    public Triples(int num)
    {
        for(int x = 0; x < num; x++){
            for(int y = x; y<num; y++){
                double c = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
                if(x%2 ==1){
                    if(y%2 ==0){
                        if(c%2 == 1){
                            System.out.println(x + " " + y + " " + c);
                        }
                    }
                }else{
                    if(y%2 == 1 ){
                        if(c%2 == 1){
                            System.out.println(x + " " + y + " " + c);
                        }
                    }
                }
            }
        }
        
    }
    
    private int greatestCommonFactor(int a, int b, int c)
    {
        int ab;
        if(a>b){
            ab = a;
        }else
        ab = b;
        for( int x = ab; x>0; x--){
            if(ab%x == 0){
                ab = x;
            }
        }
        int abc = 0;
        if(ab>c){
            abc = ab;
        }else
        abc = c;
        for(int y = abc; y>0; y--){
            if(abc%y ==0){
                abc = y;
            }
        }
        return abc;
    }

    public String toString()
    {
        String output="";
        return output+"\n";
    }
}