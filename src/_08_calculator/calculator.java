package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField x = new JTextField("00000");
	JTextField y = new JTextField("00000");
	JLabel label = new JLabel("0");
	
	public static void main(String[] args) {
	
	
	
	}
	public void setUp() {
		frame.add(panel);
		panel.add(x);
		panel.add(y);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");
		frame.setVisible(true);
		frame.pack();
	}
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int divide(int x, int y) {
		if (y == 0) {
			JOptionPane.showMessageDialog(null, "error, cannot divide by zero");
			return 0;
		}
		else {
			return x/y;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int answer = 0;
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
		if (e.getSource() == add) {
			answer = add(Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
			
		}
		else if (e.getSource() == sub) {
			answer = sub(Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
			
		}
		else if (e.getSource() == mul) {
			answer = multi(Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
			
		}
		else if (e.getSource() == div) {
			answer = divide(Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
			
		}
		label.setText(String.valueOf(answer));
		frame.pack();
	}
	
}
