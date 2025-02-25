import edu.fcps.karel2.Display;

public class Lab03 {
    public static void main(String[] args) {
        Display.openWorld("maps/mountain.map");
        Climber p1 = new Climber(8);
        p1.putBeeper();
        p1.turnRight();
        p1.move();
        p1.climbUpRight();
        p1.climbUpRight();
        p1.climbUpRight();
        p1.climbDownRight();
        p1.climbDownRight();
        p1.pickBeeper();
        p1.turnAround();
        p1.climbUpLeft();
        p1.climbUpLeft();
        p1.climbDownLeft();
        p1.climbDownLeft();
        p1.climbDownLeft();
        p1.move();

        
    }
}
