package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
// 2.  Ask the user a question 
		int score = 0;		
// 3.  Use an if statement to check if their answer is correct	
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
			
JOptionPane.showMessageDialog(null, "What is bob");	
		
		
String word = JOptionPane.showInputDialog("Think Hard...");
if(word.equalsIgnoreCase("Bob"))  { 
	score ++ ;
}else{ JOptionPane.showMessageDialog(null, "YOU BAD AT THiS GAME"); 
score -- ;
}

JOptionPane.showMessageDialog(null, "Who is bob");	


String wordTwo = JOptionPane.showInputDialog("Think Hard...");
if(wordTwo.equalsIgnoreCase("Bob"))  { 
	score ++ ;
}else{ JOptionPane.showMessageDialog(null, "YOU BAD AT THiS GAME"); 
score -- ;
}
JOptionPane.showMessageDialog(null, "Tell me about bob");	


String wordThree = JOptionPane.showInputDialog("Think Hard...");
if(wordThree.equalsIgnoreCase("Bob"))  { 
	score ++ ;
}else{ JOptionPane.showMessageDialog(null, "YOU BAD AT THiS GAME"); 
score -- ;
}
JOptionPane.showMessageDialog(null, "You scored" + score);
	}
}
