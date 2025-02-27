import edu.fcps.karel2.Display;

public class Lab09 {
    public static void shiftBeepers (Athlete arg)
    {
        while (arg.nextToABeeper()) 
        { 
            arg.pickBeeper();    
        }
        arg.turnAround();
        arg.move();
        while (arg.hasBeepers()) 
        { 
            arg.putBeeper();    
        }
    }
    public static void main(String[] args) 
    {
        
        Display.openWorld("maps/pile3.map");
        Athlete p = new Athlete(1,1,Display.EAST,0);
        Display.setSpeed(10);
        for(int i=0;i<7;i++)
        {
            p.move();
        }
        p.turnAround();
        while (p.frontIsClear() | p.nextToABeeper())
        {
            if(p.nextToABeeper())
            {
                Lab09.shiftBeepers(p);
                p.turnAround();
            }
            p.move();
        }
    }
}
