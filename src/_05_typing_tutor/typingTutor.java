package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class typingTutor {
	char currentLetter;
public static void main(String[] args) {
	
	
	
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
void setUp(){
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    
    currentLetter = generateRandomLetter();
    
}
}
