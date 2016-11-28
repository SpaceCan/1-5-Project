
/**
 * Write a description of class Pong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends Applet implements ActionListener {
	public void init()
	{
		button1 = new Button("Button 1");
		add(button1);
		button1.addActionListener(this);

		button2 = new Button("Button 2");
		add(button2);
		button2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button1)
		{
			String Button = "Button 1 was pressed";
        }	
		else
		{
			String Button = "Button 2 was pressed";
        }
    }
	
	public void ballUpdate(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(250, 250, 30, 30);
        
    }

	Button button1, button2;
}

