import java.awt.*;
import javax.swing.*;
public class Draw01 extends JPanel
{
    public Draw01()
    {
        setBackground(Color.lightGray);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //g.setColor(Color.BLUE);
        g.setColor(Color.white);
        g.fillOval(300, 75, 50, 50);
        g.setFont(new Font("Serif", Font.ITALIC, 20));
        g.drawString("Welcome Home", 40, 40);
        g.setColor(Color.black);
        g.drawLine(75, 200, 175, 150);
        g.drawLine(275, 200, 175, 150);
        g.drawLine(75, 200, 275, 200);
        g.drawRect(100, 200, 150, 150);
        g.fillRect(150, 275, 50, 75);
        g.drawLine(0, 350, 400, 350);
    }
}