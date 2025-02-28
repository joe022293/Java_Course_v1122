import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Lab11 {
    public static void main(String[] args) 
    {
        Display.openDefaultWorld();
        Display.setSize(42,37);
        Display.setSpeed(10);
        Digit first = new Zero(1,9);
        first.display();
        Digit second = new One(7,9);
        second.display();
        Digit third = new Two(13,9);
        third.display();
        Digit fourth = new Three(19,9);
        fourth.display();
        Digit fifth = new Four(25,9);
        fifth.display();
        Digit sixth = new Five(31,9);
        sixth.display();
        Digit seventh = new Six(1,20);
        seventh.display();
        Digit eighth = new Seven(7,20);
        eighth.display();
        Digit nineth = new Eight(13,20);
        nineth.display();
        Digit tenth = new Nine(19,20);
        tenth.display();
    }

}
