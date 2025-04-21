import javax.swing.*;
import edu.fcps.*;

public class Driver04EX2
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Buckets");
        frame.setSize(600,400);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BucketPanel());
        frame.setVisible((true));
        Bucket.setSpeed(10);
        Bucket.useTotal(true);
        Bucket five = new Bucket(5); 
        Bucket four = new Bucket(4);

        five.fill();//0,5
        five.pourInto(four);//4,1
        four.spill();//0,1
        five.pourInto(four);//1,0

        five.fill();//1,5
        five.pourInto(four);//4,2
        four.spill();//0,2
    }    
}
