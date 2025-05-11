   //Name:    Date:
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   import javax.swing.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t; 
      private double hits;
		//constructor   
       public PrizePanel()
      {
         myImage = new BufferedImage(FRAME,FRAME,BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0, FRAME, FRAME);

         ball = new Ball(50,50,30,Color.RED);
         pd = new Polkadot(50,50,30,Color.YELLOW);
         addMouseListener(new Mouse());
         t = new Timer(10, new Listener());
         addKeyListener(new Key());
         t.start();
         // addMouseListener(new Mouse());
         
         setFocusable(true);
         
      }
      private class Mouse extends MouseAdapter
      {
         public void mousePressed( MouseEvent e )
         {
            if(e.isAltDown()){
               ball.setX( e.getX() );
               ball.setY( e.getY() );
            }
            else if(e.isShiftDown()){
               ball.setdx(Math.random()*12-6);
               ball.setdy(Math.random()*12-6);
            }else{
               pd.setX(e.getX());
               pd.setY(e.getY());
            }
         }
      }
      private class Key extends KeyAdapter
      {
         public void keyPressed(KeyEvent e)
         {
            switch (e.getKeyCode()) {
               case KeyEvent.VK_UP:
                  ball.setY(ball.getY()-20);
                  break;
               case KeyEvent.VK_DOWN:
                  ball.setY(ball.getY()+20);
                  break;
               case KeyEvent.VK_RIGHT:
                  ball.setX(ball.getX()+20);
                  break;
               case KeyEvent.VK_LEFT:
                  ball.setX(ball.getX()-20);
                  break;

               case KeyEvent.VK_NUMPAD8:
                  pd.setY(pd.getY()-10);
                  if(pd.getY()<=pd.getRadius())
                     pd.setY(pd.getDiameter());
                  break;
               case KeyEvent.VK_NUMPAD5:
                  pd.setY(pd.getY()+10);
                  if(pd.getY()<=pd.getRadius())
                     pd.setY(pd.getDiameter());
                  break;
               case KeyEvent.VK_NUMPAD6:
                  pd.setX(pd.getX()+10);
                  if(pd.getX()<=pd.getRadius())
                     pd.setX(pd.getDiameter());
                  break;
               case KeyEvent.VK_NUMPAD4:
                  pd.setX(pd.getX()-10);
                  if(pd.getX()<=pd.getRadius())
                     pd.setX(pd.getDiameter());
                  break;  
            }
            
         }
      }

       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0,0,FRAME,FRAME);

            ball.move(FRAME, FRAME);
            collide(ball, pd);

            ball.draw(myBuffer);
            pd.draw(myBuffer);

            myBuffer.setColor(Color.BLACK);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
            repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
         double d = distance(b.getX(),b.getY(),pd.getX(),pd.getY());  
         if(d<b.getRadius() || d<pd.getRadius())
         {
            hits++;
            pd.jump(FRAME, FRAME);
         }
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
      }
   }