	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab17
   {
      //  public static void escape_the_maze(MazeEscaper arg)
      // {
      //    arg.walkDownCurrentSegment(); //you are not at the end at the start
      //    while(!arg.nextToABeeper())
      //    {
      //       arg.turnToTheNextSegment();
      //       arg.walkDownCurrentSegment();
      //    }
      // }
       public static void main(String[] args)
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(8, 8);
         Display.setSpeed(10);
         MazeEscaper p1 = new Democrat(1,5,1,0);
         MazeEscaper p2 = new Republican(1,5,1,0);
         Thread t1 = new Thread(p1);
         Thread t2 = new Thread(p2);
         t1.start();
         t2.start();
         // escape_the_maze( new Democrat(1,5,1,0) );
         // escape_the_maze( new Republican() );
      	//escape_the_maze( new Independent() );
      }
   }
