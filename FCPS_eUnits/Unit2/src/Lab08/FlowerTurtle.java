	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle implements Runnable
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
         // super.setBackground(Color.white);
         super.setColor(myColor);
         super.setSpeed(10);
         for (int i = 0; i < 30; i++) 
         {
            forward(mySize);
            turnLeft(180);
            forward(mySize);
            turnLeft(180);
            turnLeft(360/30);
         } 
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
         super.setColor(Color.green);
         turnLeft(180);
         forward(mySize*1.5);
         turnLeft(135);
         forward(mySize);
         turnRight(180);
         forward(mySize);
         turnRight(90);
         forward(mySize/2);
         turnLeft(180);
         forward(mySize/2);
         turnRight(45);
         forward(mySize);
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
      public void run()
      {
         drawPetals();
         drawStem();
      }
   }