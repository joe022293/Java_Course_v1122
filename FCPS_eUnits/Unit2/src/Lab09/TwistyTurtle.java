import edu.fcps.Turtle;
import java.awt.Color;

public class TwistyTurtle extends Turtle implements Runnable
{
    private int lengthx;
    private int endlengthx;
    private int incrementx;
    private int anglex;
    private Color cx;
    public TwistyTurtle(int x, int y, int length, int endlength, int increment, int angle, Color c)
    {
        super(x,y,90);
        lengthx = length;
        endlengthx = endlength;
        incrementx = increment;
        anglex = angle;
        cx = c;
    }
    public void run()
    {
        setColor(cx);
        for (int i = lengthx; i < endlengthx; i=i+incrementx) 
        {
            forward(i);
            turnLeft(anglex);
        }
    }
}
