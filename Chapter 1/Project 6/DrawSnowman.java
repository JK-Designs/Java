/*
	Author Information
	------------------
	Jeremy Koepke
	June 15, 2017
	www.JeremyKoepke.com

	Project Information
	-------------------
	Java Project Series
	Chapter 1 Project 6
	https://github.com/JK-Designs/Java-Exercises

	Project Description
	-------------------
	Write an applet program similar to the one in
	Listing 1.2 that displays a picture of a
	snowman. Hint: Draw three circles, one above
	the other. Make the circles progressively
	smaller from bottom to top. Make the top circle
	a happy face.
*/

import javax.swing.JApplet;
import java.awt.Graphics;

public class DrawSnowman extends JApplet
{
	public void paint(Graphics canvas)
	{
		canvas.drawOval(100, 50, 100, 100);
		canvas.drawOval(80, 150, 140, 140);
		//canvas.drawOval(100, 50, 100, 100);
	}
}