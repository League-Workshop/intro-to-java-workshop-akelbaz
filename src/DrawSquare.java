import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
public static void main(String[] args) {
Robot bob=new Robot();
bob.penDown();
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.setSpeed(10000);}
}
