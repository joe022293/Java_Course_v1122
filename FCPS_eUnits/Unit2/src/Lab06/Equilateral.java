import com.sun.nio.sctp.PeerAddressChangeNotification;
import edu.fcps.Turtle;

public class Equilateral extends Turtle {
    private double mySize;

    public Equilateral() {
        super();
        mySize = 50.0;
    }

    public void drawShape() {
        setPenDown(true);
        forward(mySize);
        turnLeft(120);
        forward(mySize);
        turnLeft(120);
        forward(mySize);
    }
}
