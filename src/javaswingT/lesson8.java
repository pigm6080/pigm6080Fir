package javaswingT;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class ImagePanel extends JFrame{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	public void PComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
public class lesson8 {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Lesson 08");
		
		jFrame.setSize(640,400);
		jFrame.setVisible(true);
		jFrame.setLocationRelativeTo(null);
		
		ImagePanel panel = new ImagePanel(new ImageIcon(".//").getImage());
		jFrame.add(panel);
		jFrame.pack();
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
