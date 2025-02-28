import edu.fcps.karel2.Display;
public class Lab10EX {
    public static void followWallsRight (Athlete arg)
    {
        while (true) 
        { 
            int k=0;
            if(arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=3;
                Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=2;
                Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                Lab10EX.tmp(arg, k);
                arg.move();
               
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                Lab10EX.tmp(arg, k);
                arg.move();
                
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=1;
                Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=0;
                Lab10EX.tmp(arg, k);
                arg.turnAround();
                arg.move();
            }
            if(arg.getX()==7)
                break;
        }
    }
    public static void followWallsLeft (Athlete arg)
    {
        while (true) 
        { 
            int k=0;
            if(arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=3;
                Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=2;
                Lab10EX.tmp(arg, k);
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
               
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                Lab10EX.tmp(arg, k);
                arg.move();
                
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=1;
                Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=0;
                Lab10EX.tmp(arg, k);
                arg.turnAround();
                arg.move();
            }
            if(arg.getX()==7)
                break;
        }
    }
    public static void tmp(Athlete arg,int k)
    {
        if(!arg.nextToABeeper())
        {
            for(int i=0;i<k;i++)
            {
                arg.putBeeper();
            }
            k=0;
        }
        else
        {
            arg.pickBeeper();
            k=0;
        }
    }

    public static void main(String[] args) 
    {
        Display.openWorld("maps/maze3.map");
        Display.setSpeed(10);
        Athlete p = new Athlete(1,1,Display.NORTH,Display.INFINITY);
        if(Math.random() < 0.5)
            Lab10EX.followWallsLeft(p);
        else
            Lab10EX.followWallsRight(p);
    }
}
