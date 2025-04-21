	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(true);     //a class method
      
         // SquareTurtle smidge1 = new SquareTurtle();
         // smidge1.setColor(Color.BLUE);
         // smidge1.setThickness(6);
         // smidge1.drawShape();
      
         // for(int i=1;i<=2;i++)
         // {
         //    SquareTurtle smidge2 = new SquareTurtle(100,250,45,i*20);
         //    smidge2.setColor(Color.RED);
         //    smidge2.setThickness(6);
         //    smidge2.drawShape();
         // }

         // for(int i=1;i<6;i++)
         // {
         //    SquareTurtle smidge3 = new SquareTurtle(450,250,45,i*30);
         //    smidge3.setColor(Color.YELLOW);
         //    smidge3.setThickness(6);
         //    smidge3.drawShape();
         // }
         Equilateral smidge4 = new Equilateral();
         smidge4.setColor(Color.RED);
         smidge4.setThickness(6);
         smidge4.drawShape();

         
      }
   }