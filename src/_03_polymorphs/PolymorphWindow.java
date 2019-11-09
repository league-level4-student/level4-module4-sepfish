package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	public ArrayList<Polymorph> morphs;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseListener(this);

		timer = new Timer(1000 / 30, this);
		timer.start();

		morphs = new ArrayList<Polymorph>();
		morphs.add(new BluePolymorph(50, 50, 50, 50));
		morphs.add(new RedMorph(200, 100, 50, 50));
		morphs.add(new CircularMorph(200, 300, 20, 20));
		morphs.add(new FollowingMorph(20, 20, 30, 30));
		morphs.add(new ImageMorph(300, 300, 120, 120, "claude.jpg"));
		morphs.add(new JOPMorph(100, 400, 70, 70));
		morphs.add(new MovingMorph(0, 0, 10, 10));
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph p : morphs) {
			p.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph p : morphs) {
			p.update();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (x > 100 && x < 170 && y > 425 && y < 495) {
			for (Polymorph p: morphs) {
				p.showMessage();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
