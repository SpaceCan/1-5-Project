package pong;

import java.awt.*;
import java.awt.geom.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class PongPane extends JPanel {
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
    
    boolean running = true;
    
    public PongPane(){
        
        // Compute the new ball coordinates 
		Timer timer = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                            
				if (running) {
					//GAME_LOOP
                                        repaint();
				}
			}
		});
		timer.start();
    }
    
    public void start() {
		if (!running) {
			running = true;
                        
                        
                        
                        repaint();
		}
	}
    @Override
    public void paintComponent(Graphics comp){
     super.paintComponent(comp);
     
        wipe(comp);
        draw(comp);
        
        
       }
    
    
    public void draw(Graphics comp){
        ballUpdate(comp);
    
        comp.setColor(Color.blue);
        comp.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        
        comp.setColor(Color.blue);
        comp.drawLine(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }
    public void wipe(Graphics comp)
    {
        comp.setColor(Color.white);
        comp.fillOval(xBall, yBall, 30, 30);
        
        comp.setColor(Color.white);
        comp.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        
        comp.setColor(Color.white);
        comp.drawLine(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }
    public void ballUpdate(Graphics comp)
    {
        comp.setColor(Color.white);
        comp.fillOval(xBall, yBall, 30, 30);
        xBall += Vx;
        yBall += Vy;
        if (xBall > 485 || xBall < 0){Vx = -1 * Vx;}
        if (yBall > 470 || yBall < 0){Vy = -1 * Vy;}
        comp.setColor(Color.red);
        comp.fillOval(xBall, yBall, 30, 30);
    }
}
