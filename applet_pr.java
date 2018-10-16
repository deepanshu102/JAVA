import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="applet_pr" width=200 height=200>
  </applet>*/
public class applet_pr extends Applet
{
	String s;
	public void init()
	{
		s="init method";
		repaint();
	}
	public void start()
	{
		s="start method";
		repaint();
	}
	public void stop()
	{
		s="stop Method";
		repaint();
	}
	public void destory()
	{
		s="destory method";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(s,100,100);
	}

}
