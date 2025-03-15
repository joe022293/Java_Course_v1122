import javax.swing.JFrame;

public class Driver02 {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Lab02");
        frame.setSize(400,400);
        frame.setLocation(150, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Draw02 test = new Draw02();
        frame.add(test);
        frame.setVisible(true);    
    }
}
