//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
 
public class Ground 
{
	private ArrayList<Image> tiles;

	private Image grass = ImageIO.read(new File("grass.gif"));
	private Image gtoroad = ImageIO.read(new File("gtoroad.gif"));
	private Image road = ImageIO.read(new File("road.gif"));
	private Image rtograss = ImageIO.read(new File("rtograss.gif"));
	
	public Ground() throws IOException
	{
		tiles  = new ArrayList<Image>();
		tiles.add(grass);
		tiles.add(gtoroad);
		tiles.add(road);
		tiles.add(rtograss);

		//point the tiles at new array list
		
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
		
		//tiles.add( ImageIO.read(new File("grass.gif")) );
	
	}
	
	public void drawGround(Graphics2D g)
	{

		
		//draw the ground on the screen	
	}	
}