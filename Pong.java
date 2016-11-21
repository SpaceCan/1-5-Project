
/**
 * Write a description of class Pong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;

public class Pong extends JApplet
{
    int x = 100;
    int y = 150;
    int Vx = 2;
    int Vy = 1;
    int[] transfer = new int[4];
    public void paint(Graphics g)
    {
        for (int i = 0; i < 1000; i++)
        {
            
            
            for (int j = 0; j < 20000000; j++)
            {
                
            }
            
            
        }
    }
    public void ballUpdate(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(x, y, 30, 30);
    
        x += Vx;
        y += Vy;
        if (x > 485 || x < 0){Vx = -1 * Vx;}
        if (y > 470 || y < 0){Vy = -1 * Vy;}
        g.setColor(Color.red);
        g.fillOval(x, y, 30, 30);
        
    }
}

