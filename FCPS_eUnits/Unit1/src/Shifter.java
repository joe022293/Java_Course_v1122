	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
      public void run()
      {
         sh();
      }
      public void sh() 
      {
         for(int i=0;i<7;i++)
         {
            move();
         }
         turnAround();
         while (frontIsClear() | nextToABeeper())
         {
            if(nextToABeeper())
            {
               shiftBeepers();
               turnAround();
            }
            move();
        }
      }
      public  void turnAround ()
      {
        turnLeft();
        turnLeft();
      }
      public  void shiftBeepers ()
      {
        while (nextToABeeper()) 
        { 
            pickBeeper();    
        }
        turnAround();
        move();
        while (hasBeepers()) 
        { 
            putBeeper();    
        }
      }
      @Override
      public void workCorner() {
          // Implement workCorner method
      }
  
      @Override
      public void moveOneBlock() {
          // Implement moveOneBlock method
      }
   }