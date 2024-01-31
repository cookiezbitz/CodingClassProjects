//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
    private int xSpeed;
    private int ySpeed;

    public Ball()
    {
        super(200,200);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x,int y){
        
        super(x,y);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x, int y, int w, int h){
        super(x,y,w,h);
        xSpeed = 3;
        ySpeed = 1;
    }
    public Ball(int x, int y, int w, int h, Color c){
        super(x,y,w,h,c);
        xSpeed = 3;
        ySpeed = 1;
        
    }
    public Ball(int x, int y, int w, int h, Color c, int xS, int yS){
        super(x,y,w,h,c);
        xSpeed = xS;
        ySpeed = yS;
        
    }
    

    //add the other Ball constructors
    
    public void setXSpeed(int x){
        xSpeed = x;
    }
    public void setYSpeed(int x){
        ySpeed = x;
    }
    public int getXSpeed(){
        return xSpeed;
    }
    public int getYSpeed(){
        return ySpeed;
    }
       
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
       //draw a white ball at old ball location
        draw(window, Color.WHITE);

      setX(getX()+xSpeed);
        //setY
        setY(getY() + ySpeed);
        draw(window, getColor());

        //draw the ball at its new location
   }
   
    public boolean equals(Object obj)
    {
        
        Ball b = (Ball)obj;
        return (super.equals(b) && this.getXSpeed() == b.getXSpeed() && this.getYSpeed() == b.getYSpeed());
    }   

   //add the get methods

   
   public String toString(){
       return super.toString() + getXSpeed() + " " + getYSpeed();
   }
   //add a toString() method
}