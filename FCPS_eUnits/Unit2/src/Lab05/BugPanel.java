    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
   import java.awt.*;
   import java.awt.image.*;
   import javax.swing.*;
    public class BugPanel extends JPanel
   {
      private BufferedImage myImage;
      final int N = 400;
       public BugPanel()
      {
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
      
         Bug a = new Bug(0,0);
         Bug b = new Bug(0,400);
         Bug c = new Bug(400,400);
         Bug d = new Bug(400,0);

         int x1,y1,x2,y2,x3,y3,x4,y4;
         while (true) 
         { 
            x1=a.getX();
            y1=a.getY();
            x2=b.getX();
            y2=b.getY();
            x3=c.getX();
            y3=c.getY();
            x4=d.getX();
            y4=d.getY();
            buffer.drawLine(x1, y1, x2, y2);
            buffer.drawLine(x2, y2, x3, y3);
            buffer.drawLine(x3, y3, x4, y4);
            buffer.drawLine(x4, y4, x1, y1);
            a.walkTowards(d, 0.1);
            b.walkTowards(a, 0.1);
            c.walkTowards(b, 0.1);
            d.walkTowards(c , 0.1);
            if(a.sameSpot(b)||a.sameSpot(c)||a.sameSpot(d)||b.sameSpot(c)||b.sameSpot(d)||c.sameSpot(d))
               break;
         }
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }