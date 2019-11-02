package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircularMorph extends Polymorph {
	
	double i;

	CircularMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		i = 1.0;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		setX(getX() + ((int)(20*Math.cos(i))));
		setY(getY() + ((int)(20*Math.sin(i))));
		i = i + 0.5;
	}
}
