import edu.fcps.karel2.Display;
import java.util.ArrayList;
import java.util.List;
public class Lab05 
{
    public static void main(String[] args) 
    {
        Display.openWorld("maps/shuttle.map");
        Racer p1 = new Racer(1);
        Racer p2 = new Racer(4);
        Racer p3 = new Racer(7);
        List<Racer> k = new ArrayList<>();
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
