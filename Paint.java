import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;

public class Paint extends Applet implements ActionListener,MouseListener,MouseMotionListener{
	String DrawMode="";
	JButton DrawLine,DrawRect,DrawCircle,DrawRoundRect,Pencil,Eraser,Clear;
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
		
		Pencil=new JButton(new ImageIcon("Photos\\pencil.png"));
		Pencil.setBackground(c1);
		Pencil.setActionCommand("Pencil");
		Pencil.addActionListener(this);
		CommandPanel.add(Pencil);
		
		Eraser=new JButton(new ImageIcon("Photos\\eraser.png"));
		Eraser.setBackground(c1);
		Eraser.setActionCommand("Eraser");
		Eraser.addActionListener(this);
		CommandPanel.add(Eraser);
		
		Clear=new JButton(new ImageIcon("Photos\\delete.png"));
		Clear.setBackground(c1)
		Clear.addActionListener(this);
		CommandPanel.add(Clear);
		
		Fill=new Checkbox("Fill");
		CommandPanel.add(Fill);
		
		add(BorderLayout.WEST,CommandPanel);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	
	private Point getTopLeft(){
		Point TopLeft = new Point();
		TopLeft.x=Math.min(FirstPoint.x , SecondPoint.x);
		TopLeft.y=Math.min(FirstPoint.y , SecondPoint.y);
		return TopLeft;
	}
	
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
		if (DrawMode.compareTo("RectRD") == 0){
			Graphics g=getGraphics();
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				g.setColor(color);
				g.setXORMode(getBackground());
				Point TopLeft=getTopLeft();
				int width=Math.abs(SecondPoint.x - FirstPoint.x);
				int height=Math.abs(SecondPoint.y - FirstPoint.y);
				g.drawRoundRect(TopLeft.x ,TopLeft.y ,width ,height,20,20 );
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(g);
		}
		if (DrawMode.compareTo("Pencil") == 0){
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				FirstPoint.x=SecondPoint.x;
				FirstPoint.y=SecondPoint.y;
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(getGraphics());
		}
		if (DrawMode.compareTo("Eraser") == 0){
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				FirstPoint.x=SecondPoint.x;
				FirstPoint.y=SecondPoint.y;
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(getGraphics());
		}
		if (DrawMode.compareTo("LineD") == 0 && Fill.getState() == true ){
			Graphics g=getGraphics();
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				g.setColor(color);
				g.setXORMode(getBackground());
				g.drawLine(FirstPoint.x,FirstPoint.y,SecondPoint.x,SecondPoint.y);
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(g);
		}
		if (DrawMode.compareTo("RectD") == 0 && Fill.getState() == true){
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
		if (DrawMode.compareTo("RectRD") == 0 && Fill.getState() == true){
			Graphics g=getGraphics();
			if (SecondPoint.x !=0 && SecondPoint.y !=0){
				g.setColor(color);
				g.setXORMode(getBackground());
				Point TopLeft=getTopLeft();
				int width=Math.abs(SecondPoint.x - FirstPoint.x);
				int height=Math.abs(SecondPoint.y - FirstPoint.y);
				g.drawRoundRect(TopLeft.x ,TopLeft.y ,width ,height,20,20 );
			}
			SecondPoint.setLocation(e.getX(),e.getY());
			paint(g);
		}
		if (DrawMode.compareTo("CircleD") == 0 && Fill.getState() == true ){
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
		if (e.getSource() == Clear){
			g.setColor(Color.white);
			g.fillRect(0,0,getSize().width,getSize().height);
			color=Color.black;
			repaint();
		}
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
			case "RectRD":
				TopLeft=getTopLeft();
				width=Math.abs(SecondPoint.x - FirstPoint.x);
				height=Math.abs(SecondPoint.y - FirstPoint.y);
				g.drawRoundRect(TopLeft.x ,TopLeft.y ,width ,height,20,20 );
				break;
			case "Pencil":
				g.drawLine(FirstPoint.x,FirstPoint.y,SecondPoint.x,SecondPoint.y);
				break;
			case "Eraser":
				g.setColor(Color.WHITE);
				g.fillRect(FirstPoint.x,FirstPoint.y,10,10);
				break;
			if (Fill.getState() == true){
				switch(DrawMode){
				case "RectD":
					Point TopLeft=getTopLeft();
					int width=Math.abs(SecondPoint.x - FirstPoint.x);
					int height=Math.abs(SecondPoint.y - FirstPoint.y);
					g.fillRect(TopLeft.x ,TopLeft.y ,width ,height );
					break;
				case "RectRD":
					TopLeft=getTopLeft();
					width=Math.abs(SecondPoint.x - FirstPoint.x);
					height=Math.abs(SecondPoint.y - FirstPoint.y);
					g.fillRoundRect(TopLeft.x ,TopLeft.y ,width ,height,20,20 );
					break;	
				case "CircleD":
					TopLeft=getTopLeft();
					width=Math.abs(SecondPoint.x-FirstPoint.x);
					height=Math.abs(SecondPoint.y-FirstPoint.y);
					g.fillOval(TopLeft.x,TopLeft.y,width,height);
				break;
				
			}
		}
		}
	}			
}