// Name: 				Date:

   import java.awt.*;
   
    public class Bumper
   {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
      private int myX;
      private int myY;
      private Color myColor;
      private int myXWidth;
      private int myYWidth;
   
     //constructors
       public Bumper()         //default constructor
      {
         myX = 10;
         myY = 10;
         myColor = Color.BLUE;
         myXWidth = 10;
         myYWidth = 10;
      }
       public Bumper(int x, int y, int xWidth, int yWidth, Color c)
      {
         myX = x;
         myY = y;
         myColor = c;
         myXWidth = xWidth;
         myYWidth = yWidth;
      }
      public int getX()
      { 
         return myX;
      }
      public int getY()
      { 
         return myY;
      }
      public Color getColor()
      { 
         return myColor;
      }
      public int getWidth()
      { 
         return myXWidth;
      }
      public int getHeight()
      { 
         return myYWidth;
      }
      public void setX(int x)
      { 
         myX = x;
      }
      public void setY(int y)
      { 
         myY = y;
      }
      public void setXWidth(int x)
      { 
         myXWidth = x;
      }
      public void setYWidth(int y)
      { 
         myYWidth = y;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
     // accessor methods  (one for each field)
   
     // modifier methods  (one for each field)
   
     // instance methods
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
        public void jump(int rightEdge, int bottomEdge)
      {
         // moves location to random (x, y) within the edges
         myX = (int)(Math.random()* (rightEdge-myXWidth));
         myY = (int)(Math.random()* (bottomEdge-myYWidth));
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getWidth(), getHeight());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getHeight(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
