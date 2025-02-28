
import java.awt.Robot;

import edu.fcps.karel2.Display;

public class SquareDancer extends Dancer
{
    public  SquareDancer(int x, int y, int dir, int beep)
    {
        super(x,y,dir,beep);
    }
    public SquareDancer()
    {
        super(1, 1, Display.EAST, 0);
    }
    public void danceStep()
    {
        move();
        move();
        move();
        turnLeft();
    }
}
