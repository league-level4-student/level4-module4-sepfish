package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

public class FollowingMorph extends Polymorph {

	FollowingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.PINK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		Point location = MouseInfo.getPointerInfo().getLocation();
		setX(location.x - 10);
		setY(location.y - 55); 
	}

}
