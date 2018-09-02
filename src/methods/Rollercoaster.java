package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height= JOptionPane.showInputDialog("How tall are you in inches? Numbers only.");
	int h=Integer.parseInt(height);
	if(h>=48) {
		System.out.println("You can go on the rollercoaster");
	}
		
	if(h<48) {
			System.out.println("You have to grow a little taller to go on the rollercoaster");
		}
	
}
}
