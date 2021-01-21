package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachine implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton roll = new JButton();
	JLabel one;
	JLabel two;
	JLabel quinoa;
	Random ran = new Random();
	int onth= 0;
	int thwosht= 0;
	int qiiounsloth= 0;
	
public static void main(String[] args) {
	
	
	
	
}	

public void setUp() throws MalformedURLException {
	
	if (onth == 0) {
	one = createLabelImage("lord-farquaad.jpg");
	}
	
	if (thwosht == 0) {
		two = createLabelImage("lord-farquaad.jpg");
	}
	
	if (qiiounsloth == 0) {
		quinoa = createLabelImage("lord-farquaad.jpg");
	}
	
	if (onth == 1) {
		one = createLabelImage("jim.jpg");
		}
		
	if (thwosht == 1) {
			two = createLabelImage("jim.jpg");
		}
		
	if (qiiounsloth == 1) {
			quinoa = createLabelImage("jim.jpg");
		}
		
	if (onth == 2) {
			one = createLabelImage("wesly.jpg");
			}
			
	if (thwosht == 2) {
				two = createLabelImage("wesly.jpg");
			}
			
	if (qiiounsloth == 2) {
				quinoa = createLabelImage("wesly.jpg");
			}
	
	
	
	
	roll.addActionListener(this);
	
	one.setPreferredSize(new Dimension(238, 300));
	two.setPreferredSize(new Dimension(238, 300));
	quinoa.setPreferredSize(new Dimension(238, 300));
	
	panel.add(one);
	panel.add(two);
	panel.add(quinoa);
	panel.add(roll);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	
}

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
//Icon icon = new ImageIcon(new ImageIcon(new ImageIcon(imageURL).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	panel.removeAll();
	onth = ran.nextInt(3);
	thwosht = ran.nextInt(3);
	qiiounsloth = ran.nextInt(3);
	
	try {
		setUp();
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	if (onth == thwosht && qiiounsloth == onth) {
		
		JOptionPane.showMessageDialog(null, "you won absolutly nothing stop wasting your time and money on this stupid slot machine do you know how long this took to make");
	}
	
	
}


	
}
