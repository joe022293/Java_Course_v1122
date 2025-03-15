import javax.swing.JFrame;

public class Driver03 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Lab03");
        frame.setSize(400,400);
        frame.setLocation(150, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel03 test = new Panel03();
        frame.add(test);
        frame.setVisible(true);
    }    
}
