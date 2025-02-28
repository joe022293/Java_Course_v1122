import edu.fcps.karel2.Display;
public class Lab10 {
    public static void followWallsRight (Athlete arg)
    {
        while (!arg.nextToABeeper()) 
        { 
            if(!arg.rightIsClear() & arg.frontIsClear())
            {
                arg.move();
            }
            else if(!arg.rightIsClear() & !arg.frontIsClear())
            {
                arg.turnLeft();
            }
            else if(arg.rightIsClear())
            {
                arg.turnRight();
                arg.move();
            }
        }
    }
    public static void main(String[] args) {
        Display.openWorld("maps/maze2.map");
        Athlete p = new Athlete(1,1,Display.NORTH,Display.INFINITY);
        Lab10.followWallsRight(p);



    }
}
