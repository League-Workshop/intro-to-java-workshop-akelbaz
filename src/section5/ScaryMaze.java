package section5;

import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;
	
	ScaryMaze() throws Exception {
		//1. Use this online tool to make a maze image and drop it into your section5 package: http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("pixil-frame-0.png"));
		//2. Change the line of code above so that it matches your maze's file name
		JOptionPane.showMessageDialog(null, "No Cheating. Get All The Coins For The Most Points And Be Carefull For The Land Mines");		
		//3. Set the mouse pointer to the start of your maze using:
		new Robot().mouseMove(45, 95);
		
		//4. Add a mouse motion listener using:
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		//5. Print the mouseColor variable 
System.out.println(mouseColor);		
		//6.  Run your program and put your mouse over the background to find out what color it is
		
		//7. Create an int variable that holds the background color. 
int background = -9252952;
int endColor = -11751600;
int mine = -14408668;
int gold = -16121;
int score = 0;

if(mouseColor == mine) {
scare();	
}
if(mouseColor == gold) {
score ++ ;	
}
		//8. If the mouse falls off the path (if it is on the background)
if(mouseColor == background){
	scare();
}
				// call the scare method
		
		//13. If the mouse is on the end color
if(mouseColor == endColor){
	System.out.println("mouse "+mouseColor);
	System.out.println("end "+endColor);	
	score += 3;

	JOptionPane.showMessageDialog(null, "You are not a crab " + " your score is " + score);	
}
				// pop up a message to tell them they won
		
	}

	private void scare() {
		System.out.println("HAHAHAHAHAHAHAHAHAHA!");
		//9. Find a scary sound and put it in the section5 package where you put your maze picture. You can find a sound on freesound.org. Log in as freesound.org.
		
		//10. Use the code below to load your sound.  Change the file name to match the name of your sound file.  
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("bob.wav"));
		
		//11. Play the scary sound. Hint: type "sound" and then a period.		
sound.play();		
		//12. Drop an image into your section5 package, and use the showScaryImage method to scare your victim!
showScaryImage("john.png");		
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



