public class LineDancer extends Dancer
{
    public LineDancer(int x,int y,int dir,int beep)
    {
        super(x,y,dir,beep);
    }
    public LineDancer()
    {
        super(1,1,1,0);
    }
    public void danceStep()
    {
        move();
        move();
        move();
        turnAround();
    }

}
