public class Democrat extends MazeEscaper
{
    public void walkDownCurrentSegment()
    {
        if(frontIsClear())
            move();
    }
    public void turnToTheNextSegment()
    {
        if(!leftIsClear() & frontIsClear())
        {
            
        }
        else if(leftIsClear())
        {
            turnLeft();
        }
        else
        {
            turnRight();
        }
    }
    public Democrat()
    {
        super();
    }
    public Democrat(int x,int y, int dir,int beeps)
    {
        super(x,y,dir,beeps);
    }
}
