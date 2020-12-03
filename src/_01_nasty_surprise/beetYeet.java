package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class beetYeet implements MouseListener {
	
	JButton beet = new JButton("beet");
	JButton yeet = new JButton("yeet");

public static void main(String[] args) {
	
}
public void run() {		
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	beet = new JButton("beet");
	yeet = new JButton("yeet");
	
	frame.add(panel);
	panel.add(beet);
	panel.add(yeet);
	beet.addMouseListener(this);
	yeet.addMouseListener(this);
	frame.pack();
	frame.setVisible(true);
	

	
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.setSize(100, 100);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource() == beet) {
		showPictureFromTheInternet("https://www.bostonherald.com/wp-content/uploads/2020/06/GettyImages-626331104.jpg");
	}
	if (e.getSource() == yeet) {
		showPictureFromTheInternet("https://pics.me.me/thumb_imgflip-com-lion-king-meme-templates-imgflip-53695159.png");
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
