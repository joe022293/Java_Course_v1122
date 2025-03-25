import javax.swing.*;
import edu.fcps.*;

public class Driver04b
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
        Bucket three = new Bucket(3);

        three.fill();   //3
        four.fill();    //7
        five.fill();    //12

        three.spill();  //9

        three.fill();
        four.spill();   //8
        

        five.fill();    //5
        three.spill();
        four.spill();

        four.fill();    //4
        five.spill();

        four.pourInto(five);
        three.fill();
        three.pourInto(five);
        five.spill();   //2

        three.pourInto(four);
        three.fill();
        three.pourInto(four);
        four.spill();   //1

        five.fill();    //6

        four.fill();    //10

        four.spill();
        three.fill();
        three.pourInto(four);
        three.fill();
        three.pourInto(four);
        four.fill();
        
    }    
}
