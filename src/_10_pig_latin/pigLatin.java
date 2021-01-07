package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatin implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField words = new JTextField();
	JButton button = new JButton("translate");
	JTextField ordsway = new JTextField();
	
public static void main(String[] args) {
	
}	

public void setUp() {
	
	frame.add(panel);
	panel.add(words);
	panel.add(button);
	panel.add(ordsway);
	button.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}



}
