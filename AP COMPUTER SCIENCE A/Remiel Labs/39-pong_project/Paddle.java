//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
        super(10,10);
      speed =5;
   }

   public Paddle(int e, int b){
       super(e,b);
       speed = 5;
    }
   
    public Paddle(int e, int b, int f){
       super(e,b);
       speed = f;
   }
   public Paddle(int e, int b, int c, int d , int f){
       super(e,b,c,d);
       speed = f;
   }
   public Paddle(int e, int b, int c, int d , Color cc, int f){
       super(e,b,c,d,cc);
       speed = f;
   }
    

   //add the other Paddle constructors

   public void moveUpAndDraw(Graphics window)
   {
   }

   public void moveDownAndDraw(Graphics window)
   {
   }

   //add get methods
   public int getSpeed(){
       return speed;
   }
   
   
   //add a toString() method
   public  String toString(){
       return super.toString() + " " + speed;
   }
}