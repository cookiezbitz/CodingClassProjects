//(c) A+ Computer Science
//www.apluscompsci.com

public class DogRunner
{
    public static void main( String[] args )
    {
        //add test cases   
        Dog d = new Dog( "rover" );
        System.out.println( d.getPeopleAge( 7 ) );
        d.increaseAgeByOne();
        d.increaseAgeByOne();

        System.out.println( d.getPeopleAge( 11 ) );
        System.out.println( d.getName() );
        Dog d2 = new Dog( "rover" , 7 );
        System.out.println( d2.getPeopleAge( 8 ) );
        
        Dog g = new Dog ("bob" ,3);
        System.out.println( g.getName() );
        System.out.println( g.getPeopleAge( 5 ) );

        //use the examples on the lab handout            
    }
}