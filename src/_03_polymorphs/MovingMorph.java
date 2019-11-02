package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	
	Random rand;
	int i;
	int xPos;
	int yPos;

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		rand = new Random();
		xPos = x;
		yPos = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		if (i % 2 == 0) { 
			setX(xPos + rand.nextInt(30));
			setY(yPos + rand.nextInt(30));
		} else {
			setX(xPos - rand.nextInt(30));
			setY(yPos - rand.nextInt(30));
		}
		xPos++;
		yPos++;
	}

}
