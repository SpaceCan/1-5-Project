import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;

public class Pong extends Applet implements KeyListener
{
    int x = 0;
    int xBall = 250;
    int yBall = 250;
    
    int PaddleMoveSpeed = 10;
    
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
    
    /*@Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                case KeyEvent.VK_W:{
                    Paddle1Up();                    
                    break;}
                case KeyEvent.VK_S:{
                    Paddle1Down();
                    break;}
                case KeyEvent.VK_UP:{
                    Paddle2Up();
                    break;}
                case KeyEvent.VK_DOWN:{
                    Paddle2Down();
                    break;}

                }
            }
    */
   
   @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                case 87:{
                    Paddle1Up();                    
                    break;}
                case 68:{
                    Paddle1Down();
                    break;}
                case 38:{
                    Paddle2Up();
                    break;}
                case 40:{
                    Paddle2Down();
                    break;}

                }
            }
   
    public Pong(){
       requestFocusInWindow();
       addKeyListener(this);
       this.setFocusable(true);
       //setRequestFocusEnabled(true);
    }
            
    public void paint(Graphics g)
    {  
       
       
       while(/*temp*/ x <= 1000){
       wipe(g);
       draw(g);
       for(int i = 0; i <= 10000000; ++i){;}
       if (x % 5 == 0){Paddle1Up();}
       if (x % 3 == 0){Paddle1Up();}
       x += 1;
       }
       
       
    
    
    
    
    }   
    @Override
    public void keyReleased(KeyEvent e){}
    @Override
    public void keyTyped(KeyEvent e){}
   
    public void Paddle1Up(){
        y1Paddle1 += PaddleMoveSpeed;
        y2Paddle1 += PaddleMoveSpeed;
    }
    
    public void Paddle1Down(){
        y1Paddle1 -= PaddleMoveSpeed;
        y2Paddle1 -= PaddleMoveSpeed;
    }
    
    public void Paddle2Up(){
        y1Paddle2 += PaddleMoveSpeed;
        y2Paddle2 += PaddleMoveSpeed;
    }
    
    public void Paddle2Down(){
        y1Paddle2 -= PaddleMoveSpeed;
        y2Paddle2 -= PaddleMoveSpeed;
    }
    public void draw(Graphics g){
        ballUpdate(g);
    
        g.setColor(Color.blue);
        g.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        
        g.setColor(Color.blue);
        g.drawLine(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }
    public void wipe(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(xBall, yBall, 30, 30);
        g.setColor(Color.white);
        g.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        g.setColor(Color.white);
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
        
