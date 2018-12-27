package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
JOptionPane.showMessageDialog(null, "Hello");	
String hate = JOptionPane.showInputDialog("who do you hate");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
JOptionPane.showMessageDialog(null, "You totally have a crush on" + hate);
		// 3. Ask the user for the name of their best friend
JOptionPane.showMessageDialog(null, "Hello");	
String bestFriend = JOptionPane.showInputDialog("who is your best friend");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, bestFriend + "is as sweet as candy");
	; 
}
}


