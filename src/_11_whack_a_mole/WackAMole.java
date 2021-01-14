package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackAMole implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int holyMoley = 0;
	Date november221957 = new Date();
	int ohhohohohoh = 0;
	
	public static void main(String[] args) {
		
		 
		
	}
	
	
	void setUp() {
		
		Random ran = new Random();
		int mile = ran.nextInt(25);
			for (int i = 0; i < 25; i++) {
				
			JButton button = new JButton();
			if (i==mile) {
				button.setText("MOLE");
				button.setFont(new Font("Arial", Font.PLAIN, 15));		
				}
			button.setPreferredSize(new Dimension(100,50));
			button.addActionListener(this);
			panel.add(button);
			
		}
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(550, 320);
		
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	    JOptionPane.showMessageDialog(null, "you missed " + ohhohohohoh + " moles" );
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton boot = (JButton) e.getSource();
		if (boot.getText().equals("MOLE")) {
			panel.removeAll();
			frame.remove(panel);
			holyMoley++;
			
			if (holyMoley == 10) {
				endGame(november221957, 10);
				
			}
			else {
				setUp();
			}
				
		}
		
		else {
			ohhohohohoh++;
			
			panel.removeAll();
			frame.remove(panel);
			setUp();
				
		}
	}
	
}
