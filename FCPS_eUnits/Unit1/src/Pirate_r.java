//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 4.16.2003

import edu.fcps.karel2.Display;

public class Pirate_r extends Athlete {

   public Pirate_r() {
      super(1, 1, Display.EAST, 0);
   }

   public void approachPile() {
      if (!nextToABeeper()) {
         move();
         approachPile();
      }
   }

   public int numOfBeepersInPile() {
      if (nextToABeeper()) {
         pickBeeper();
         return 1 + numOfBeepersInPile();//1+1+1+1+0
      } else {
         return 0;
      }
   }

   public void turnAppropriately(int beepers) {
      switch (beepers) {
         case 1:
            turnLeft();
            break;
         case 2:
            turnAround();
            break;
         case 3:
            turnRight();
            break;
         default:
            break;
      }

   }
}
