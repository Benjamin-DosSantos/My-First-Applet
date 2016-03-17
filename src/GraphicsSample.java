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
public class GraphicsSample extends Applet {

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
		 * X & Y Coordinates CAN Be Negative
		 * ie: (-100, -100)
		 * 
		 */
		
		
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
			
			
			/**
			 * 
			 * G.drawOval() is Used To Make an Oval In An Applet
			 * The First Parameter is X Position
			 * The Second Parameter is The Y Position
			 * The Third Parameter is The Width
			 * The Forth Parameter Is The Height
			 * 
			 **/
			
				g.drawOval(500, 200, 300, 600);
			
			/**
			 * 
			 * g.drawRect() is Used To Make an Rectangle In An Applet
			 * The First Parameter is X Position
			 * The Second Parameter is The Y Position
			 * The Third Parameter is The Width
			 * The Forth Parameter Is The Height
			 * 
			 **/
			
				g.drawRect(50, 60, 70, 80);
			
			/**
			 * 
			 * G.drawLine() is Used To Make a Line In An Applet
			 * The First Parameter is X Position Of The Start Point
			 * The Second Parameter is The Y Position Of The Start Point
			 * The Third Parameter is The X Position Of The End Point
			 * The Forth Parameter Is The Y Position Of The End Point
			 * 
			 **/
			
				g.drawLine(90, 100, 110, 120);
			
			/**
			 * 
			 * G.drawRoundRect() is Used To Make a Rounded Rectangle In An Applet
			 * The First Parameter is X Position
			 * The Second Parameter is The Y Position
			 * The Third Parameter is The Width
			 * The Forth Parameter Is The Height
			 * The Fifth Parameter Is The Curve Start On The Width
			 * The Sixth Parameter Is The Curve Start On The Height
			 * 
			 **/
			
				g.drawRoundRect(120, 130, 200, 150, 10, 50);
			
			/**
			 * 
			 * The Graphics System Does Not Have A Preset For Circles 
			 * So To Create A Circle The Programmer Must Make An Oval 
			 * With The Same Third And Forth Parameters.
			 * 
			 */
			
				g.drawOval(150, 170, 30, 30);
			
			/**
			 * 
			 * The Graphics System Does Not Have A Preset For Squares 
			 * So To Create A Squares The Programmer Must Make A Rectangle 
			 * With The Same Third And Forth Parameters.
			 * 
			 */
			
				g.drawRect(170, 200, 70, 70);

			/** 
			 * 
			 * The Graphics System Does Not Have A Preset For Triangles 
			 * So To Create A Triangle The Programmer Must Make 2 Lines That
			 * Start At The Same Point ex: 600, 600
			 * Then The Programmer Sets The End Point Of The Two Lines 
			 * ex: (700, 700) And (500, 700)
			 * The Forth Argument Stays The Same Because The Triangle In This Example 
			 * Has A Flat Bottom(This Can Also Be Changed By Changing The Forth Argument)
			 * Lastly The Programmer Must Add A Third Line That Starts At One Of The 
			 * Other Line's End Points And Ends At The Other Line's End Point
			 * 
			 */
							
				g.drawLine(600, 600, 700, 700);
				g.drawLine(600, 600, 500, 700);
				g.drawLine(500, 700, 700, 700);
	
	} /** End Of Paint Method **/
} /** End Of Class **/