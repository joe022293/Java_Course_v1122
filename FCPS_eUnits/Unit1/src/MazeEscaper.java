   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003
	//updated 5.13.2009 mlbillington@fcps.edu

   public abstract class MazeEscaper extends Athlete implements Runnable
   {
      public MazeEscaper()
      {
         super();
      }
      public MazeEscaper(int x,int y, int dir,int beeps)
      {
         super(x,y,dir,beeps);
      }
      public abstract void walkDownCurrentSegment();
      public abstract void turnToTheNextSegment();
      public void run()
      {
         walkDownCurrentSegment(); //you are not at the end at the start
         while(!nextToABeeper())
         {
            turnToTheNextSegment();
            walkDownCurrentSegment();
         }
      }
   }