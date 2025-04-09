	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
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
         
         FlowerTurtle smidge1 = new FlowerTurtle(100,40,Color.blue);
         FlowerTurtle smidge2 = new FlowerTurtle(200,40,Color.red);
         FlowerTurtle smidge3 = new FlowerTurtle(300,40,Color.yellow);
         FlowerTurtle smidge4 = new FlowerTurtle(400,40,Color.orange);
         Thread t1 = new Thread(smidge1);
         Thread t2 = new Thread(smidge2);
         Thread t3 = new Thread(smidge3);
         Thread t4 = new Thread(smidge4);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
      }
   }