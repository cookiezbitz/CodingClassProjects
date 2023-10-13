//(c) A+ Computer Science
//www.apluscompsci.com

public class Social
{
    public static String ss(String socialsec){
        int num1;
        int num2;
        int num3;
        int toties = 0;
        String nummer1;
        String nummer2;
        String nummer3;
        String ogsec = socialsec;
        
        nummer1 = socialsec.substring(0,socialsec.indexOf("-"));
        nummer2 = socialsec.substring(socialsec.indexOf("-") + 1,socialsec.lastIndexOf("-"));
        nummer3 = socialsec.substring(socialsec.lastIndexOf("-") + 1);
        
        //System.out.println(nummer1 + " " +  nummer2 +  " " + nummer3);
        
        
        num1 = Integer.parseInt(nummer1);
        num2 = Integer.parseInt(nummer2);
        num3 = Integer.parseInt(nummer3);
        toties = num1 + num2 + num3;
        
        
        return ogsec + " has a total of " + toties;
    }
}