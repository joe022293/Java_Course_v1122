public class Lab15 {
    public static void main(String[] args) 
    {
        Dancer p1 = new SquareDancer(5,5,1,0);
        Dancer p2 = new LineDancer(7,7,1,0);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
    }
}
