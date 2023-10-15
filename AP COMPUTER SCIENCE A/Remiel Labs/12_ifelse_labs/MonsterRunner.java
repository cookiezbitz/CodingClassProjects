//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MonsterRunner
{
    public static void main( String args[] )
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter 1st monster's name :: ");
        String name1 = kb.nextLine();
        System.out.println("Enter 1st monster's size :: ");
        int size1 = kb.nextInt();
        
        String discordbaddie = kb.nextLine();
        System.out.println("Enter 2nd monster's name :: ");
        String name2 = kb.nextLine();
        
        
        System.out.println("Enter 2nd monster's size :: ");
        int size2 = kb.nextInt();
        
        //System.out.println(name1 + size1);
        //System.out.println(name2 + size2);
        
        Monster m = new Monster(name1, size1);
        Monster m2 = new Monster(name2, size2);
        
        
        
        //ask for name and size
        System.out.println(m);
        System.out.println(m2);
        
        if(m.getHowBig()>m2.getHowBig()){
            System.out.println("Monster one is bigger than Monster two.");
            
        }else{
            System.out.println("Monster one is smaller than Monster two.");
        }
        if(m.getName().equals(m2.getName())){
            System.out.println("Monster one has the same name as Monster two.");
        }
        //instantiate monster one        
        
        //ask for name and size
        
        //instantiate monster two
    }
}