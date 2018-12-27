package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");		
		// Get the user to enter an adjective
		String adjetive = JOptionPane.showInputDialog("enter adjetive. OR ELSE........");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("enter liquid. OR ELSE....");
		// Get the user to enter a body part
		String bodyPart = JOptionPane.showInputDialog("enter body part. OR ELSE.....");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("enter verb. OR ELSE...");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("please just enter a place. Im like really desperate to finish this thing and i'm out of threats. wahhhhhhhhhhhh");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more" + adjetive + "during the day, so cross the river at night. Piranhas are attracted to fresh" + liquid + "and will most likely take a bit out of your" + bodyPart + "if you" + verb + "Whatever you do if you have an open wound try to find another way to get back to the" + place + "Good Luck. THanks for doing this i am bob and like cheese." );		
		

	}
}

