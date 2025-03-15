	//Name______________________________ Date_____________
   import java.awt.*;
   import java.awt.image.BufferedImage;
   import javax.swing.JPanel;
   public class Panel03 extends JPanel
   {
      private BufferedImage myImage;
      public Panel03()
      {
         final int N = 400; //width & height of buffered-image
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
      
      	//webbing
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         for(int k = 0; k <= 50; k++)
         {
            buffer.drawLine(N * k / 50, 0, N, N * k / 50);
            buffer.drawLine(N * (50-k) / 50, 0, 0, N * k / 50);
            buffer.drawLine(N * k / 50, 400, N, N * (50-k) / 50);
            buffer.drawLine(N * (50-k) / 50, 400, 0, N * (50-k) / 50);
         }
      
      	//sunshine
         int x = N / 2, y = N / 2; //center
         int x1, y1, x2, y2;							//endpoint for each ray
         int size = 60;					//length of each ray
         int size2 = 100;
         int r1 = 60, r2 = 55;			//radius of the sun
      
         for(int i=0;i<360;i=i+9)
         {
            x1 = (int) (x + size * Math.cos(i * Math.PI / 180));
            y1 = (int) (x + size * Math.sin(i * Math.PI / 180));
            x2 = (int) (x + size2 * Math.cos(i * Math.PI / 180));
            y2 = (int) (x + size2 * Math.sin(i * Math.PI / 180));
            buffer.drawLine(x1, y1, x2, y2);
         }
      
         buffer.setColor(Color.BLUE.brighter());
         buffer.fillOval(x - r1, y - r1, r1 * 2, r1 * 2);
         buffer.setColor(Color.YELLOW);
         buffer.fillOval(x - r2, y - r2, r2 * 2, r2 * 2);	
      }
      public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }