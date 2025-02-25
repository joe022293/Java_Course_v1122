import edu.fcps.karel2.Display;
//Athlete has been done
public class Lab02 {
    public static void main(String[] args) {
        Display.openWorld("maps/maze.map");
        Athlete test = new Athlete();
        test.putAndMove();
        test.turnRight();
        test.putAndMove();
        test.turnRight();
        test.putAndMove();
        test.turnLeft();
        test.putAndMove();
        test.turnLeft();
        test.putAndMove();
        test.turnRight();
        test.putAndMove();
        test.putAndMove();
        test.turnRight();
        test.putAndMove();
        test.turnLeft();
        test.putAndMove();
        test.turnLeft();
        test.putAndMove();
        test.putAndMove();
        test.putAndMove();
        test.putAndMove();
        test.turnRight();
        test.putAndMove();
        test.putAndMove();
    }
}
