import edu.fcps.karel2.Display;

public class Dorothy extends Athlete
{
    public Dorothy()
    {
        super(2,2,Display.EAST,Display.INFINITY);
    }
    public boolean findPath()
    {
        if(!nextToABeeper())
        {
            turnAround();
            move();
        }
        turnLeft();
        if(frontIsClear())
        {
            move();
            if(nextToABeeper())
                return true;
            else
            {
                turnAround();
                move();
            }
        }
        else
            turnAround();
        if(frontIsClear())
        {
            move();
            if(nextToABeeper())
                return true;
            else
            {
                turnAround();
                move();
            }
        }
        return false;
    }
    public void followPath()
    {
        while (frontIsClear() && nextToABeeper()) 
        {
            move();    
        }
    }
}
