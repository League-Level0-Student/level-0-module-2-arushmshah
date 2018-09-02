package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age= JOptionPane.showInputDialog("How old are you? Numbers only.");
		int a=Integer.parseInt(age);
		if(a>=18) {
			JOptionPane.showInputDialog("Who should be the next president?");
		}
			
		if(a<18) {
				System.out.println("You have to be a little older to vote for a president.");
			}
		
	}
	}


