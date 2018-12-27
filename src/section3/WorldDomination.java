package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		JOptionPane.showMessageDialog(null, "Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		String word = JOptionPane.showInputDialog("Yes or No");
		if(word.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You Will Rule The World");			
		}else {
			JOptionPane.showMessageDialog(null, "HAVE FUN WASHING DISHES!!!!!");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

