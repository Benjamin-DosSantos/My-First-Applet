/** The Following Libraries Are Needed  **/
import java.applet.Applet;	/** The Applet Library Allows us To Use The Applet Functions **/
import java.awt.Graphics;   /** The Graphics Class Allows Us To Draw **/ 

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Hello World Applet
 *	Project Description: This Applet draws the string "Hello World" in Black On the applet window
 * 
 **/

/** 
 * 
 * The Following is My Class That Will Contain All My Source Code
 * The Words Extends Applet allows My Application to Be Run As 
 * An Application.
 *  
 **/
public class Hello_World extends Applet{

	/** 
	 * 
	 * The Following Method is Used To Display graphics 
	 * Within The Applet Window
	 * The Graphics g parameter is the Library Used
	 * To Draw Objects On The Screen  
	 * 
	 **/
	
	public void paint(Graphics g){
		
		/**
		 * 
		 * g.drawString is Used To Display Text within The Applet Window  
		 * The First Parameter Is The Text That Will Be Displayed 
		 * The Second Parameter Is The X Location
		 * The Third Parameter Is The Y Location  
		 * 
		 **/
		
		g.drawString("Hello World", 400, 400);
		
	} /** End Of Paint Method **/
} /** End Of Class **/