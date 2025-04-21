	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
import javax.print.attribute.standard.Sides;
    public class PolygonTurtle_star extends Turtle
   {
      private double mySize;
      private int mySides;
       public PolygonTurtle_star()
      {
         super();
         mySize = 50.0;
         mySides = 6;
      }
       public PolygonTurtle_star(double n, int s)
      {
         mySize = n;
         mySides = s;
      }
       public PolygonTurtle_star(double x, double y, double h, double n, int s)
      {
         super(x, y, h);
         mySize = n;
         mySides = s;
      }
       public void setSize(double n)
      {
         mySize = n;
      }
       public void setSides(int s)
      {
         mySides = s;
      }
       public void drawShape()
      {
         int d = (int)(mySides-5)/2+2;
         System.err.println(d);
         float angle = 180-180*(mySides-d*2)/mySides;
         for(int i=0;i<mySides;i++)
         {
            forward(mySize);
            turnLeft(angle);
         }
      }
   }