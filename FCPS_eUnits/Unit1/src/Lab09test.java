import edu.fcps.karel2.Display;

public class Lab09test {
    public static void shiftBeepers (Athlete arg)
    {
        int n1=0,n2=0;
        n1=beepersNum(arg);
        arg.move();
        for(int j=0;j<7;j++)
        {
            n2=n1;
            n1=beepersNum(arg);
            for(int i=0;i<n2;i++)
            {
                arg.putBeeper();
            }
            arg.move();
        }
    }
    public static int beepersNum(Athlete arg)
    {
        int i=0;
        while(arg.nextToABeeper())
        {
            arg.pickBeeper();
            i=i+1;
        }
        return i;
    }
    public static void main(String[] args) 
    {
        
        Display.openWorld("maps/pile1.map");
        Athlete p = new Athlete(1,1,Display.EAST,0);
        Display.setSpeed(10);
        shiftBeepers(p);
    }
}
