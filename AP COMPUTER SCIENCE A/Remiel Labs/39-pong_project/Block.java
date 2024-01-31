//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block {
   private int xPos;
   private int yPos;
   private int width;
   private int height;

   private Color color;

   
   public Block() {
       xPos = 0;
       yPos = 0;
       width = 0;
       height = 0;
       color = Color.WHITE;
   }

   public Block(int x, int y){
       xPos = x;
       yPos = y;
       width = 0;
       height = 0;
       color = color.WHITE;
   }
   // add other Block constructors - x , y , width, height, color
    public Block(int x,int y,int w,int h){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = Color.WHITE;
    }
    public Block(int x,int y,int w,int h, Color c){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = c;
    }
   // add the other set methods
   
   
   public void setXY(int x, int y){
       xPos = x;
       yPos = y;
       
   }
   
   public void setX(int x){
       xPos = x;
   }

   public void setY(int y){
       yPos = y;
   }
   
   
   public void setColor(Color col) {
        color = col;
   }

   public void draw(Graphics window) {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
   }

   public void draw(Graphics window, Color col) {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }

   public boolean equals(Object obj) {
       Block b = (Block) obj;
       return (this.xPos == b.xPos && this.yPos == b.yPos);
      
   }

   // add the other get methods
   
 
    public int getX(){
        return xPos;
    }
    public int getY(){
        return yPos;
    }
    public Color getColor(){
        return color;
    }

   
   
   public String toString(){
       return xPos + " " + yPos + " " + width  + " " + height + " " + color;
   }
   // add a toString() method - x , y , width, height, color
}