//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Person 
{
	private ArrayList<Image> list;	
	private int x, y, current,speed;
	
	private Image front = ImageIO.read(new File("dude.gif"));
	private Image right = ImageIO.read(new File("dudeR.gif"));
	private Image up = ImageIO.read(new File("dudeU.gif"));
	private Image left = ImageIO.read(new File("dudeL.gif"));

	public Person(int x, int y) throws IOException
	{
		this.x=x;
		this.y=y;
		speed = 5;


		list = new ArrayList<Image>();
		list.add(front);
		list.add(right);
		list.add(up);
		list.add(left);
		
		//point the array list at a new ArrayList
		
		//add all images to the list		
	}
	
	// will return true if person collides with another object
	public boolean collide(int x, int y)
	{
		Rectangle a = new Rectangle(this.x, this.y, 50, 50);
		Rectangle b = new Rectangle(x, y, 50, 50);
		return a.intersects(b);
	}
	
	public void drawPerson(Graphics2D g)
	{
		//draw the current image on the screen 
		g.drawImage(getCurrent(), x, y, null);
	}
	
	public Image getCurrent()
	{
		
		//return the current image (which matches the direction they are facing)
		return list.get(current);
	}
	
	public int getX()
	{
		
		return x;
	}
	public int getY()
	{
		
		return y;
	}
	
	public void moveRight()
	{
		x += speed;
		current = 1;
		// update current (direction) and move right		
	}
	
	public void moveLeft()
	{
		x-= speed;
		current = 3;
	}
	
	public void moveUp()
	{
		y-=speed;
		current = 2;
	}
	
	public void moveDown()
	{
		current = 0;
		y+=speed;
	}
}
