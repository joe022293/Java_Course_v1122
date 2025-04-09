import edu.fcps.Turtle;
import java.awt.Color;

public class TwistyTurtle3 extends Turtle implements Runnable
{
    private int lengthx;
    private int endlengthx;
    private int incrementx;
    private Color cx;
    public TwistyTurtle3(int x, int y, int length, int endlength, int increment,Color c)
    {
        super(x,y,90);
        lengthx = length;
        endlengthx = endlength;
        incrementx = increment;
        cx = c;
    }
    public void run()
    {
        drawShape();
    }
    public void drawShape()
    {
        setColor(cx);
        for (int i = lengthx; i < endlengthx; i=i+incrementx) 
        {
            for(int j = 0; j < 4; j++)
            {
                forward(i);
                turnLeft(90);
            }
            turnLeft(45);
        }
    }
}
