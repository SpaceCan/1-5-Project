
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewPong extends JApplet implements KeyListener
{
    int xBall = 250;
    int yBall = 250;
    
    int x1Paddle1 = 10;
    int x2Paddle1 = 10;
    int y1Paddle1 = 150;
    int y2Paddle1 = 250;
    
    int x1Paddle2 = 450;
    int x2Paddle2 = 450;
    int y1Paddle2 = 150;
    int y2Paddle2 = 250;
    
    int Vx = 2;
    int Vy = 1;
    int[] transfer = new int[4];
    
    public void paint(Graphics g)
    {  
       I(); 
       draw(g);
    }
    
    public void I(){addKeyListener(this);}
    public void init(){addKeyListener(this);}
    public void keyPressed(KeyEvent e){
        //e.getKeyChar()
        if (e.getKeyCode() == KeyEvent.VK_UP)
            {
                x1Paddle2 += 1;
                  x2Paddle2 += 1;   
                }
          else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                x1Paddle2 -= 1;
                  x2Paddle2 -= 1;
            }
           if (e.getKeyCode() == KeyEvent.VK_W){
                x1Paddle1 += 1;
                x2Paddle1 += 1;
            }
              else if (e.getKeyCode() == KeyEvent.VK_D){
                x1Paddle1 -= 1;
                x2Paddle1 -= 1;
                }       
            }  
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    
    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(xBall, yBall, 30, 30);
    
        g.setColor(Color.blue);
        g.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        
        g.setColor(Color.blue);
        g.drawLine(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }
    public void wipe(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(xBall, yBall, 30, 30);
        g.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        g.drawLine(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }
    public void ballUpdate(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(xBall, yBall, 30, 30);
        xBall += Vx;
        yBall += Vy;
        if (xBall > 485 || xBall < 0){Vx = -1 * Vx;}
        if (yBall > 470 || yBall < 0){Vy = -1 * Vy;}
        g.setColor(Color.red);
        g.fillOval(xBall, yBall, 30, 30);
          
        
    }
    
}
