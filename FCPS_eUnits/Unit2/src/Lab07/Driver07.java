	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         // PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
         // smidge.setColor(Color.BLUE);
         // smidge.setThickness(6);
         // smidge.drawShape();
         
         // PolygonTurtle a = new PolygonTurtle(100,5);
         // a.setColor(Color.BLUE);
         // a.setThickness(6);
         // a.drawShape();

         // PolygonTurtle b = new PolygonTurtle(250,420,6,20,50);
         // b.setColor(Color.BLUE);
         // b.setThickness(6);
         // b.drawShape();
      
         PolygonTurtle_star a = new PolygonTurtle_star(100,5);
         a.setColor(Color.BLUE);
         a.setThickness(5);
         a.setSides(6);
         a.drawShape();
      }
   }