import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;

public class Paint extends Applet implements ActionListener,MouseListener,MouseMotionListener{
	String DrawMode="";
	JButton DrawLine,DrawRect,DrawCircle,DrawRoundRect;
	Color color;
	Checkbox Fill;
	Point FirstPoint = new Point(0,0);
	Point SecondPoint = new Point(0,0);
	public void init{
		setLayout(new BorderLayout());
		Panel CommandPanel=new Panel();
		CommandPanel.setLayout(new GridLayout(15,2,20,20));
		CommandPanel.setBackground(new Color(223,234,246,255));
		
		DrawLine=new JButton(new ImageIcon("Photos\\line.png"));
		DrawLine.setBackground(c1);
		DrawLine.setActionCommand("LineD");
		DrawLine.addActionListener(this);
		CommandPanel.add(DrawLine);
		
		DrawRect=new JButton(new ImageIcon("Photos\\rectangle.png"));
		DrawRect.setBackground(c1);
		DrawRect.setActionCommand("RectD");
		DrawRect.addActionListener(this);
		CommandPanel.add(DrawRect);
		
		DrawCircle=new JButton(new ImageIcon("Photos\\circle.png"));
		DrawCircle.setBackground(c1);
		DrawCircle.setActionCommand("CircleD");
		DrawCircle.addActionListener(this);
		CommandPanel.add(DrawCircle);
		
		DrawRoundRect=new JButton(new ImageIcon("Photos\\roundrect.png"));
		DrawRoundRect.setBackground(c1);
		DrawRoundRect.setActionCommand("RectRD");
		DrawRoundRect.addActionListener(this);
		CommandPanel.add(DrawRoundRect);
		
		add(BorderLayout.WEST,CommandPanel);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	
	public void mousePressed(MouseEvent e){
		FirstPoint.setLocation(0,0);
		SecondPoint.setLocation(0,0);
		FirstPoint.setLocation(e.getX(),e.getY());
		
	}
	public void mouseReleased(MouseEvent e){
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(getGraphics());
	}
	public void mouseDragged(MouseEvent e){
		if (DrawMode.compareTo("LineD") ==0){
			Graphics g=getGraphics();
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				g.setColor(color);
				g.setXORMode(getBackground());
				g.drawLine(FirstPoint.x,FirstPoint.y,SecondPoint.x,SecondPoint.y);
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(g);
		}
		if (DrawMode.compareTo("RectD") == 0){
			Graphics g=getGraphics();
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				g.setColor(color);
				g.setXORMode(getBackground());
				Point TopLeft=getTopLeft();
				int width=Math.abs(SecondPoint.x - FirstPoint.x);
				int height=Math.abs(SecondPoint.y - FirstPoint.y);
				g.drawRect(TopLeft.x ,TopLeft.y ,width ,height );
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(g);
		}
		if (DrawMode.compareTo("CircleD") == 0 ){
			Graphics g=getGraphics();
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				g.setColor(color);
				g.setXORMode(getBackground());
				Point TopLeft=getTopLeft();
				int width=Math.abs(SecondPoint.x - FirstPoint.x);
				int height=Math.abs(SecondPoint.y - FirstPoint.y);
				g.drawOval(TopLeft.x ,TopLeft.y ,width ,height );
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(g);
		}
	}
	public void actionPerformed(ActionEvent e){
		DrawMode = e.getActionCommand();
		Graphics g = getGraphics();
		}
	public void paint(Graphics g){
		g.setColor(color);
		switch(DrawMode){
			case "LineD":
				g.drawLine(FirstPoint.x,FirstPoint.y,SecondPoint.x,SecondPoint.y);
				break;
			case "RectD":
				Point TopLeft=getTopLeft();
				int width=Math.abs(SecondPoint.x - FirstPoint.x);
				int height=Math.abs(SecondPoint.y - FirstPoint.y);
				g.drawRect(TopLeft.x ,TopLeft.y ,width ,height );
				break;
			case "CircleD":
				TopLeft=getTopLeft();
				width=Math.abs(SecondPoint.x-FirstPoint.x);
				height=Math.abs(SecondPoint.y-FirstPoint.y);
				g.drawOval(TopLeft.x,TopLeft.y,width,height);
				break;
		}
	}			
}