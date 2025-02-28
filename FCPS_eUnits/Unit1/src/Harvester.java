	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Harvester extends Robot implements Workable
   {
      public Harvester(int x, int y)
      {
         super(x, y, Display.EAST, Display.INFINITY);
      }
      public Harvester()
      {
         super(2, 2, Display.EAST,  Display.INFINITY);
      }
      public void workCorner()
      {
         while(!nextToABeeper())
         {
            putBeeper();
         } 
      }
      public void moveOneBlock()
      {
         move();
      }
      public void turnToTheRight()
      {
         turnLeft();
         turnLeft();
         turnLeft();
      }
      public void turnToTheNorth()
      {
         while(!facingNorth())
         {
            turnLeft();
         }
      }
   }