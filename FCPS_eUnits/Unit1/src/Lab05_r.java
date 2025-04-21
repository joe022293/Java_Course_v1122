import edu.fcps.karel2.Display;
import java.util.ArrayList;
import java.util.List;
public class Lab05_r 
{
    public static void main(String[] args) 
    {
        Display.openWorld("maps/shuttle.map");
        Display.setSpeed(10);
        Racer_r p1 = new Racer_r(1);
        Racer_r p2 = new Racer_r(4);
        Racer_r p3 = new Racer_r(7);
        List<Racer_r> k = new ArrayList<>();
        k.add(p1);
        k.add(p2);
        k.add(p3);
        for (int i=0;i<k.size();i++)
        {
            k.get(i).shuttle(2, 7);
            k.get(i).shuttle(4, 5);
            k.get(i).shuttle(6, 3);
            k.get(i).move();
        }

    }
}
