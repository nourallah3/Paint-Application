import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;

public class Paint extends Applet implements ActionListener,MouseListener,MouseMotionListener{
	String DrawMode="";
	JButton DrawLine;
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
		}
	}			
}