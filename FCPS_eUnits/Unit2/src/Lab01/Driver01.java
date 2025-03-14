import java.awt.Color;
import javax.swing.JFrame;

public class Driver01 {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Lab01");
        frame.setSize(400,400);
        frame.setLocation(150, 250);
        frame.getContentPane().setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Draw01 test = new Draw01();
        frame.add(test);
        // frame.setContentPane(new Draw01());
        frame.setVisible(true);
    }
}