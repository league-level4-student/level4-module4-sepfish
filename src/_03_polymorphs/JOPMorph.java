package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;


public class JOPMorph extends Polymorph {

	JOPMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(150, 75, 160));
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		
	}
	

}
