import java.applet.Applet;
import java.awt.Graphics;


public class House extends Applet{

	static int x = 200;
	static int y = 200;
	static int width = 300;
	static int height = 300;
	
	public void paint(Graphics g){ 
		
		g.drawRect(x, y, width, height);
		
		g.drawLine(x, y, x + width, y);
		g.drawLine(x, y, x + (width / 2), y - (height / 2));
		g.drawLine(x + (width/ 2), y - (height / 2), x + width, y);
		
		g.drawRect((x + (width / 3)), height, (x - (width / 3)), (y + height));
		
	}
}
