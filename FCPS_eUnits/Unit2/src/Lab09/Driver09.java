import javax.swing.JFrame;
import edu.fcps.Turtle;
import java.awt.Color;

public class Driver09
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Polygon Turtles");
        frame.setSize(400, 400);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new TurtlePanel());
        frame.setVisible(true);
        Turtle.clear(Color.white);
         
        TwistyTurtle smidge1 = new TwistyTurtle(200,300,5,400,10,123,Color.blue);
        TwistyTurtle smidge2 = new TwistyTurtle(100,200,0,150,2,30,Color.red);
        TwistyTurtle3 smidge3 = new TwistyTurtle3(400,400,25,150,5,Color.black);
        Thread t1 = new Thread(smidge1);
        Thread t2 = new Thread(smidge2);
        Thread t3 = new Thread(smidge3);
        t1.start();
        t2.start();
        t3.start();
    }
}
