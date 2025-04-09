import java.awt.*;
import javax.swing.*;
public class Panel00 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 300, 125);
        g.setFont(new Font("Serif", Font.BOLD, 50));
        g.setColor(new Color(0, 0, 0));
        g.drawString("Hello World", 50, 150);
    }
}