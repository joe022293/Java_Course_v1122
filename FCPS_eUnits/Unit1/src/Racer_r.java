import edu.fcps.karel2.Display;

public class Racer_r extends Athlete
{
    public Racer_r(int y)
    {
        super(1,y,Display.EAST,Display.INFINITY);
    }
    public void jumpRight()
    {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
    public void jumpLeft()
    {
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void sprint(int n)
    {
        // System.err.println(n);
        if(n>0)
        {
            move();
            sprint(n-1);
        }
    }
    public void put(int n)
    {
        if(n>0)
        {
            putBeeper();
            put(n-1);
        }
    }
    public void pick(int n)
    {
        if(n>0)
        {
            pickBeeper();
            pick(n-1);
        }
    }
    public void shuttle(int spaces,int beepers)
    {
        move();
        jumpRight();
        sprint(spaces);
        pick(beepers);
        turnAround();
        sprint(spaces);
        jumpLeft();
        move();
        put(beepers);
        turnAround();
    }
}
