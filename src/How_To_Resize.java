/** The Following Libraries Are Needed  **/
import java.applet.Applet;	/** The Applet Library Allows us To Use The Applet Functions **/
import java.awt.Graphics;   /** The Graphics Class Allows Us To Draw **/ 

/** 
 * 
 * The Following is My Class That Will Contain All My Source Code
 * The Words Extends Applet allows My Application to Be Run As 
 * An Application.
 *  
 **/
public class How_To_Resize extends Applet{

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
		 * this.setSize is Used To Change The Size Of The Applet Frame
		 * The First Parameter is The Width 
		 * The Second Parameter Is The Height
		 * 
		 **/
	
			this.setSize(1000, 800);
	
		/**
		 * 
		 * g.drawString is Used To Display Text within The Applet Window  
		 * The First Parameter Is The Text That Will Be Displayed 
		 * The Second Parameter Is The X Location
		 * The Third Parameter Is The Y Location  
		 * 
		 **/
		
			g.drawString("APPLETS YAY!!", 400, 400);
			g.drawString("MORE STRINGS!!", 500, 500);
			g.drawString("GRAPHICS POSITIONS!!", 600, 600);
		
	} /** End Of Paint Method **/
} /** End Of Class **/