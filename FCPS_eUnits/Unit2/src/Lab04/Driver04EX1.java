import javax.swing.*;
import edu.fcps.*;

public class Driver04EX1
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
        Bucket six = new Bucket(6);

        six.fill();//0,6
        six.pourInto(five);//5,1
        five.spill();//0,1
        six.pourInto(five);//1,0

        six.fill();//1,6
        six.pourInto(five);//5,2
        five.spill();//0,2
        six.pourInto(five);//2,0

        six.fill();//2,6
        six.pourInto(five);//5,3
        five.spill();//0,3
        six.pourInto(five);//3,0

        six.fill();//3,6
        six.pourInto(five);//5,4
        five.spill();//0,4
    }    
}
