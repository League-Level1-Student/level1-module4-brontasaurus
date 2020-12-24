package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	char currentLetter;
	 JLabel label;
	 JPanel panel;
public static void main(String[] args) {
	
	
	
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
void setUp(){
	JFrame frame = new JFrame();
    panel = new JPanel();
    label = new JLabel();
    label.setText(Character.toString(currentLetter));
    label.setFont(label.getFont().deriveFont(28.0f));
    label.setHorizontalAlignment(JLabel.CENTER);
    
    frame.addKeyListener(this);
    panel.add(label);
    frame.add(panel);
    frame.setVisible(true);
    frame.pack();
    
    currentLetter = generateRandomLetter();
    
    
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyChar() == currentLetter) {
		System.out.println("Correct! you typed: " + currentLetter);
		panel.setBackground(Color.green);
		currentLetter = generateRandomLetter();
		label.setText(Character.toString(currentLetter));
		
	}
	
	else {
		panel.setBackground(Color.red);
		System.out.println("you should have typed " + currentLetter);
	}
	
}
}
