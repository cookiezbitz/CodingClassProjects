//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;

public class Enemies 
{
	private ArrayList<Enemy> enemies;
	private Person guy;
	
	public Enemies(Person p)
	{
		enemies = new ArrayList<Enemy>();
		guy = p;		
	}
	
	// DRAW AND COLLISION METHOD
	public void drawAndCollision(Graphics2D g) throws IOException
	{
		// ADD ENEMIES
		
		// REMOVE ENEMIES THAT GO OUT OF BOUND
		
		// GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
		
		// IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method		
	}
	
	public void GAMEOVER(Graphics2D g)
	{
		Game.RUNNING = false;
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("GAME OVER!", 400, 300);
	}
	
	public void VICTORY(Graphics2D g)
	{
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("VICTORY!", 400, 300);
		Game.RUNNING = false;
	}
	
	// ADDS AN ENEMY TO THE ENEMY LIST
	public void addEnemy() throws IOException
	{
		
	}
	
	// RETURN HOW MANY ENEMIES THERE ARE
	public int numEnemies()
	{
		return 0;
	}
}
