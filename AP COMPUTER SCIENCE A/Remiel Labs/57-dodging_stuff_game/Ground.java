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
		//fill screen with grass
		for (int j = 0; j<= Game.HEIGHT; j++){
			if(j%50 ==0){
		for(int i = 0; i <= Game.WIDTH; i++){
			//draw a row of grass
			if(i%50 ==0){
				g.drawImage(grass, i, j, null);
			}
		}
		}
	}
	// g to r
		for (int w = 0; w<= Game.WIDTH; w++){
			if(w%50 ==0){
				g.drawImage(gtoroad,w,100,null);
			}
		}

		//add road
		for (int j = 150; j< Game.HEIGHT-100; j++){
			if(j%50 ==0){
		for(int i = 0; i <= Game.WIDTH; i++){
			//draw a row of road
			if(i%50 ==0){
				g.drawImage(road, i, j, null);
			}
		}
		}
		// r to g
		for (int p = 0; p<= Game.WIDTH; p++){
			if(p%50 ==0){
				g.drawImage(rtograss,p,Game.HEIGHT-100,null);
			}
		}
		

	}
		

		//draw the ground on the screen	
	}	
}