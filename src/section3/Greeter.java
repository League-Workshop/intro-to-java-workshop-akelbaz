package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Hello");	
String name = JOptionPane.showInputDialog("please type your name");
JOptionPane.showMessageDialog(null, "Hello" +  name);
}
}
