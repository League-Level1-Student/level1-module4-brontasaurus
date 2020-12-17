package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckle_clicker implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton joke;
	JButton juice;
	Random ran;
	int i = 0;
	
	
public static void main(String[] args) {
	
	
}
	
void makebuttons() {
	frame = new JFrame();
	panel = new JPanel();
	joke = new JButton("Joke");
	juice = new JButton("Punch Line");
	ran = new Random();
	
	panel.add(joke);
	panel.add(juice);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	
	joke.addActionListener(this);
	juice.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource() == joke) {
		i = ran.nextInt(5);
		
		switch(i) {
		
		case 0:{
			JOptionPane.showMessageDialog(null, "What do you get if you mix human DNA and whale DNA?");
			break;
		}
		
		case 1:{
			JOptionPane.showMessageDialog(null, "Mayo is a horse");
			break;
		}

		case 2:{
			JOptionPane.showMessageDialog(null, "I found out my girlfriend is really a ghost.");
			break;
		}

		case 3:{
			JOptionPane.showMessageDialog(null, "My girlfriend borrowed $100 from me. After 3 years, when we separated, she returned exactly $100.");
			break;
		}

		case 4:{
			JOptionPane.showMessageDialog(null, "Why do java programmers wear glasses");
			break;
		}

		default:{
			JOptionPane.showMessageDialog(null, "Did you hear about the mathematician who was afraid of negative numbers?");
			break;
		}
		
		}
	}
	
	else if (e.getSource() == juice) {
		int z = ran.nextInt(5);
		
		while (z==i) {
			z=ran.nextInt();
		}
		
		switch(z) {
		
		case 0:{
			JOptionPane.showMessageDialog(null, "Banned from SeaWorld");
			break;
		}
		
		case 1:{
			JOptionPane.showMessageDialog(null, "Mayo Neighs");
			break;
		}

		case 2:{
			JOptionPane.showMessageDialog(null, "I had my suspicions the moment she walked through the door.");
			break;
		}

		case 3:{
			JOptionPane.showMessageDialog(null, "I lost Interest in that relationship.");
			break;
		}

		case 4:{
			JOptionPane.showMessageDialog(null, "Because they cant C#");
			break;
		}

		default:{
			JOptionPane.showMessageDialog(null, "He would stop at nothing to avoid them.");
			break;
		}
		
		}
	}
	
	
}

}
