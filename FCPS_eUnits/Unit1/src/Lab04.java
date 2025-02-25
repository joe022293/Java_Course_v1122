import edu.fcps.karel2.Display;
import java.lang.classfile.instruction.ConstantInstruction;


public class Lab04 {
    public static void takeTheField(Athlete arg) {
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();
        arg.move();
    }
    public static void takeTheField(Athlete arg,int x,int y,int dir,int beepers) {
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();

    }
    public static void main(String[] args) {
        Display.openWorld("maps/arena.map");
        Athlete p1 = new Athlete();
        Athlete p2 = new Athlete();
        Athlete p3 = new Athlete();
        Athlete p4 = new Athlete();
        Athlete p5 = new Athlete();
        Athlete p6 = new Athlete();
        Athlete c = new Athlete();
        Lab04.takeTheField(p1);
        p1.move();
        p1.move();
        p1.move();
        p1.turnLeft();
        p1.move();
        p1.move();
        p1.turnAround();
        Lab04.takeTheField(p2);
        p2.move();
        p2.move();
        p2.move();
        p2.move();
        p2.move();
        p2.turnLeft();
        p2.move();
        p2.turnAround();
        Lab04.takeTheField(p3);
        p3.move();
        p3.move();
        p3.move();
        p3.move();
        p3.turnRight();
        Lab04.takeTheField(p4);
        p4.move();
        p4.move();
        p4.move();
        p4.turnRight();
        Lab04.takeTheField(p5);
        p5.move();
        p5.move();
        p5.turnRight();
        Lab04.takeTheField(p6);
        p6.move();
        p6.turnLeft();
        p6.move();
        p6.turnAround();
        Lab04.takeTheField(c, 1, 1, 1, 0);

    }
}
