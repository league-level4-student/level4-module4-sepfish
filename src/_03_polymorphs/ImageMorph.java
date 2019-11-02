package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {
	
	public static BufferedImage img;

	ImageMorph(int x, int y, int width, int height, String imgName) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream(imgName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, getX(), getY(), getWidth(), getHeight(), null);
	}

}
