import java.awt.*;
import javax.swing.*;
public class Draw02 extends JPanel
{
    public Draw02()
    {
        setBackground(Color.red);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int r=20;
        for (int i = 0; i < 10; i++) 
        {
            g.fillOval(100, i*r+100-r-5, r, r);
            g.fillOval(240, i*r+100-r-5, r, r);
        }
        for (int i = 0; i < 8; i++) 
        {
            g.fillOval(100+i*r, 75, r, r);
            g.fillOval(100+i*r, 255, r, r);
        }
        g.fillRect(110, 85, 140, 180);
        ImageIcon thomas = new ImageIcon("src/Lab02/tj.jpg");
        g.drawImage(thomas.getImage(), 117, 92, null);

        g.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,30));

        g.drawString("Our Fearless Leader", 50, 310);
    }
}