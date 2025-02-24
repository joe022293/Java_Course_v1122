import edu.fcps.karel2.Display;




public class Lab01 {
    public static void main(String[] args) {
        Display.openWorld("maps/school.map");
        Athlete pete = new Athlete(4,5,Display.SOUTH,0);
        Athlete lisa = new Athlete();
        lisa.turnRight();
        lisa.move();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.pickBeeper();
        lisa.turnAround();
        lisa.move();
        lisa.turnRight();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.move();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.move();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.move();
        lisa.turnRight();
        lisa.move();
        lisa.putBeeper();
        pete.pickBeeper();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnRight();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnRight();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.putBeeper();
        pete.turnAround();
        pete.move();
    }
}
