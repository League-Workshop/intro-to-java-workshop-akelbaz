package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell my favorite word, name, and thing on earth, bob");
		// 2. Catch the user's answer in a String
		String word = JOptionPane.showInputDialog("spell the word");

		// 3. If the user spelled the word correctly, speak "correct"
		if (word.equalsIgnoreCase("bob")) {

			speak("correct");

		} else {
			// 4. Otherwise say "wrong"
			speak("no. bob is spelled B-O-B");

		}
		// 5. repeat the process for other words
		speak("spell frank");
		String wordThree = JOptionPane.showInputDialog("spell the word");
		if (wordThree.equalsIgnoreCase("frank")) {

			speak("correct");

		} else {
			speak("you terrible at this game");
		}
		speak("spell jimmy");
		String wordTwo = JOptionPane.showInputDialog("spell the word");
		if (wordTwo.equalsIgnoreCase("jimmy")) {

			speak("correct");
		} else {
			speak("no. jimmy is spelled J-I-M-M-Y");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
