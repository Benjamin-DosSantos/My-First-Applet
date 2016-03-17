import java.applet.Applet;
import java.awt.Graphics;


/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Graph - Stick Figure - Applet
 *	Project Description: This file creates a stick figure by using
 *	the graphics system to draw lines and ovals.
 * 
 **/


public class Bob_The_Figure extends Applet{	
	public void paint(Graphics g){
		
		this.setSize(1000, 1000);
		
		/** Creation Of All Integers **/
		int 
		
			/** Head Information **/
			head_x_pos = 150, 
			head_y_pos = 150, 
			head_width = 200, 
			head_height = 200, 
			
			/** Left Eye Information **/
			left_eye_x_pos = 200, 
			left_eye_y_pos = 200,
			left_eye_width = 20,
			left_eye_height = 20,
			
			/** Right Eye Information **/
			right_eye_x = 280,
			right_eye_y = 200,
			right_eye_width = 20,
			right_eye_height = 20,
			
			/** Mouth Information **/
			mouth_x_1 = 200,
			mouth_y_1 = 300,
			mouth_x_2 = 300,
			mouth_y_2 = 300,
			
			/** Body Information **/
			body_x_1 = 250,
			body_y_1 = 350,
			body_x_2 = 250,
			body_y_2 = 650,
			
			/** Left Leg Information **/		
			left_leg_x_1 = 250,
			left_leg_y_1 = 650,
			left_leg_x_2 = 150,
			left_leg_y_2 = 850,
			
			/** Right Leg Information **/			
			right_leg_x_1 = 250,
			right_leg_y_1 = 650,
			right_leg_x_2 = 350,
			right_leg_y_2 = 850,
			
			/** Left Arm Information **/		
			left_arm_x_1 = 250,
			left_arm_y_1 = 450, 	/** Original Was 350 **/
			left_arm_x_2 = 150,
			left_arm_y_2 = 350, 	
			
			/** Right Arm Information **/
			right_arm_x_1 = 250,
			right_arm_y_1 = 450,	/** Original Was 350 **/
			right_arm_x_2 = 350,
			right_arm_y_2 = 350,	/** Original Was 250 **/
			
			/** Box Information **/
			box_x_pos = 400,
			box_y_pos = 400,
			box_width = 200,
			box_height = 200,
			box_text_x_pos = 500,
			box_text_y_pos = 500; 

		
		/** Head **/
		
		g.drawOval(head_x_pos, head_y_pos, head_width, head_height);
		
		/** Eyes **/
		
		/** Left Eye **/
		g.drawOval(left_eye_x_pos, left_eye_y_pos, left_eye_width, left_eye_height);
		
		/** Right Eye **/
		g.drawOval(right_eye_x, right_eye_y, right_eye_width, right_eye_height);
		
		/** End Of Eyes **/
		
		/** Mouth **/
		
		g.drawLine(mouth_x_1, mouth_y_1, mouth_x_2, mouth_y_2);
		
		/** End Of Mouth **/
		
		/** End Of Head **/
		
		/** Body **/
		
		/** Core **/
		g.drawLine(body_x_1, body_y_1, body_x_2, body_y_2);
		
		/** End Of Core **/
		
		/** Legs **/
		
		/** Left Leg **/
		g.drawLine(left_leg_x_1, left_leg_y_1, left_leg_x_2, left_leg_y_2);
		
		
		/** Right Leg **/
		g.drawLine(right_leg_x_1, right_leg_y_1, right_leg_x_2, right_leg_y_2);
		
		/** End Of Legs **/
		
		/** Arms **/
		
		/** Right Arm **/
		g.drawLine(right_arm_x_1, right_arm_y_1, right_arm_x_2, right_arm_y_2);
			
		/** Left Arm **/
		g.drawLine(left_arm_x_1, left_arm_y_1, left_arm_x_2, left_arm_y_2);
		
		/** End Of Arms **/
		
		/** End Of Core **/
		
		/** End Of Body **/
		
		/** Box And Name **/
		
		g.drawRect(box_x_pos, box_y_pos, box_width, box_height);
		
		/** Name **/ 
		
		g.drawString("Bob", box_text_x_pos, box_text_y_pos);
		
		/** End Of Box And Name **/
	}
	
}
