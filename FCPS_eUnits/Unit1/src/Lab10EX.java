import edu.fcps.karel2.Display;

public class Lab10EX {
    public static void followWallsRight (Athlete arg)
    {
        while (true) 
        { 
            int k=0;
            int check=0;
            if(arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=3;
                check=Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=2;
                check=Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                check=Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                check=Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                check=Lab10EX.tmp(arg, k);
                arg.move();
               
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                check=Lab10EX.tmp(arg, k);
                arg.move();
                
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=1;
                check=Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=0;
                arg.turnAround();
                arg.move();
            }
            if(check==1 && arg.nextToABeeper())
            {
                int beeperNum=0;
                while(arg.nextToABeeper())
                {
                    arg.pickBeeper();
                    beeperNum=beeperNum+1;
                }
                if(beeperNum==1)
                {
                    arg.putBeeper();
                    break;
                }
                else
                {
                    for(int i=0;i<beeperNum;i++)
                        arg.putBeeper();
                }
            }
            else
                check=0;
        }
    }
    public static void followWallsLeft (Athlete arg)
    {
        int check=0;
        while (true) 
        { 
            int k=0;
            if(arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=3;
                check=Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=2;
                check=Lab10EX.tmp(arg, k);
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                check=Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                check=Lab10EX.tmp(arg, k);
                arg.turnRight();
                arg.move();
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & arg.leftIsClear())
            {
                k=2;
                check=Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
               
            }
            else if(!arg.rightIsClear() & arg.frontIsClear() & !arg.leftIsClear())
            {
                k=1;
                check=Lab10EX.tmp(arg, k);
                arg.move();
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & arg.leftIsClear())
            {
                k=1;
                check=Lab10EX.tmp(arg, k);
                arg.turnLeft();
                arg.move();
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear() & !arg.leftIsClear())
            {
                k=0;
                //check=Lab10EX.tmp(arg, k);
                arg.turnAround();
                arg.move();
            }
            if(check==1 && arg.nextToABeeper())
            {
                int beeperNum=0;
                while(arg.nextToABeeper())
                {
                    arg.pickBeeper();
                    beeperNum=beeperNum+1;
                }
                arg.putBeeper();
                if(beeperNum==1)
                {
                    arg.putBeeper();
                    break;
                }
                else
                {
                    for(int i=0;i<beeperNum;i++)
                        arg.putBeeper();
                }
            }
            else
                check=0;
        }
    }
    public static int tmp(Athlete arg,int k)
    {
        if(!arg.nextToABeeper())
        {
            for(int i=0;i<k;i++)
            {
                arg.putBeeper();
            }
            return 1;
        }
        else
        {
            arg.pickBeeper();
            return 0;
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
