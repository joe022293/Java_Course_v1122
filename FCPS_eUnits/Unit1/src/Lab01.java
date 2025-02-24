import edu.fcps.karel2.Display;




public class Lab01 {
    public static void main(String[] args) {
        Display.openWorld("maps/school.map");
        Athlete a = new Athlete(4,5,Display.SOUTH,0);

        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.turnRight();
        a.move();
        a.move();
        a.move();
        a.turnRight();
        a.move();
        a.move();
        a.move();
        a.turnRight();
        a.move();
        a.turnLeft();
        a.move();
        a.pickBeeper();
        a.turnAround();
        a.move();
        a.turnRight();
        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.move();
        a.move();
        a.move();
        a.turnRight();
        a.move();
        a.move();
        a.turnLeft();
        
        //a.move();

        //a.move();
        //a.turnRight();
        
        
    }
}
