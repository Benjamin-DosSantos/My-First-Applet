import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;


public class HelloWorldFont extends Applet{

	public void paint(Graphics g){
		
		  Font tr = new Font("Impact", Font.BOLD, 60);

		  g.setFont(tr);
		  
		g.drawString("Hello World Fonts", 100, 100);

		
		
		
	}	
}
