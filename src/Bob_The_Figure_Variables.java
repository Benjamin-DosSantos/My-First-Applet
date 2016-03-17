import java.applet.Applet;
import java.awt.Graphics;


/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Stick Figure - Variables- Applet
 *	Project Description: This file creates a stick figure by using
 *	the graphics system to draw lines and ovals while using
 *	one singular point as a base for the whole stick figure.
 * 
 **/


public class Bob_The_Figure_Variables extends Applet{	
	public void paint(Graphics g){
		
		this.setSize(1000, 1000);
		
		/** Creation Of All Integers **/
		int 
		
			/** Head Information **/
			head_x_pos = 200, 	/** Creates the x variable for the x head position **/
			head_y_pos = 000, 	/** Creates the y variable for the y head position **/
			head_width = 200, 	/** Creates the width variable for the head **/
			head_height = 200;	/** Creates the height variable for the head  **/
			
	

		
		/** Head **/
		
		/** Draws the head of the stick figure with the variables given above **/
		
		g.drawOval(head_x_pos, head_y_pos, head_width, head_height);
		
		/** Eyes **/
		
		/** Left Eye **/
		
		/** Draws the left eye using the head x and y position adding 50 and then setting the width and height **/
		
		g.drawOval(head_x_pos + 50, head_y_pos + 50, 20, 20);	
		
		/** Right Eye **/
		
		/** 
		  * Draws the right eye using the head x position adding the width of the head(bringing the point to the other side of the head)
		  * subtracting 50 (brings the point to the desired position) then setting the width and height 
		  *
		  **/
	
		g.drawOval((head_x_pos + head_width) - 50, head_y_pos + 50, 20, 20);	
		
		
		/** End Of Eyes **/
	
		/** Mouth **/
	
		g.drawLine(head_x_pos + 50, (head_y_pos + head_height) - 50, (head_x_pos + head_width) - 50, (head_y_pos + head_width) - 50);
		
		/** End Of Mouth **/
		
		/** End Of Head **/
		
		/** Body **/
		
		/** Core **/
		g.drawLine((head_x_pos + (head_width / 2)), head_y_pos + head_height , head_x_pos + (head_width / 2), (head_y_pos + head_height) + 300);
		
		/** End Of Core **/
		
		/** Legs **/
		
		/** Left Leg **/
		g.drawLine((head_x_pos + (head_width / 2)), (head_y_pos + head_height) + 300, head_x_pos, (head_y_pos + head_height) + 500);
		
		
		/** Right Leg **/
		g.drawLine((head_x_pos + (head_width / 2)), (head_y_pos + head_height) + 300, head_x_pos + head_width, (head_y_pos + head_height) + 500);
		
		/** End Of Legs **/
		
		/** Arms **/
		
		/** Right Arm **/
		g.drawLine((head_x_pos + (head_width / 2)), (head_y_pos + head_height) + 100, head_x_pos, head_y_pos + head_height);
			
		/** Left Arm **/
		g.drawLine((head_x_pos + (head_width / 2)), (head_y_pos + head_height) + 100, head_x_pos + head_width, head_y_pos + head_height);
		
		/** End Of Arms **/
		
		/** End Of Core **/
		
		/** End Of Body **/
		

	}
	
}
