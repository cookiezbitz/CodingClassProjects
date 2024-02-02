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
	
	private int randomy;
	private int randoms ;
	private int numEnemies = 6;
	
	public Enemies(Person p)
	{
		enemies = new ArrayList<Enemy>();
		guy = p;		
	}	
	
	// DRAW AND COLLISION METHOD
	public void drawAndCollision(Graphics2D g) throws IOException
	{	
		randomy = 150 + (int)(Math.random() * 350);
		randoms = 3 + (int)(Math.random()*7.0);
		
		
		if(enemies.size() < numEnemies){
			addEnemy();
		}
		
		
		
		// REMOVE ENEMIES THAT GO OUT OF BOUND
		for(int x = 0; x < enemies.size(); x++){
			if(enemies.get(x).getX() > Game.WIDTH){
				enemies.remove(x);
				x--;
			}
			
		}
		
		// GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
		for(Enemy enem : enemies){
			enem.draw(g);
			enem.move();

			if(guy.collide(enem.getX(),enem.getY())){
				GAMEOVER(g);
			}

		}
		// IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method
				if(guy.getY() > 700){
					VICTORY(g);
				}
				
				
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
		enemies.add(new Enemy(50, randomy, randoms));
		//numEnemies++;
		
	}
	
	
	// RETURN HOW MANY ENEMIES THERE ARE
	public int numEnemies()
	{
		return numEnemies;
	}
}
