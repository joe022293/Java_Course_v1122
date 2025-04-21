	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08_Discussion
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.white);
         
         Turtle smidge = new FlowerTurtle();
         twisties(smidge);
      }
      public static void twisties(Turtle arg)
      {
         arg.setPenDown(false);
         arg.turnRight((int)(Math.random() * 360));
         arg.forward((int)(Math.random() * 200));
         arg.setPenDown(true);
         arg.drawShape(); 
      }
      // public static void main(String[] args)
      // {
      //    Turtle smidge = new SquareTurtle();
      //    twisties(smidge);
      // }
      // public static void main(String[] args)
      // {
      //    Turtle smidge = new PolygonTurtle();
      //    twisties(smidge);
      // }
      
      // public static void main(String[] args)
      // {
      //    Turtle smidge = new FlowerTurtle();
      //    twisties(smidge);
      // }
      
   }