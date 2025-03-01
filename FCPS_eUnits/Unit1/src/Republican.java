public class Republican extends MazeEscaper
{
    public void walkDownCurrentSegment()
    {
        if(frontIsClear())
            move();
    }
    public void turnToTheNextSegment()
    {
        if(!rightIsClear() & frontIsClear())
        {
            
        }
        else if(rightIsClear())
        {
            turnRight();
        }
        else
        {
            turnLeft();
        }
    }
    public Republican()
    {
        super();
    }
    public Republican(int x,int y, int dir,int beeps)
    {
        super(x,y,dir,beeps);
    }
}
