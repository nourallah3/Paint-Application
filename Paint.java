import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;

public class Paint extends Applet implements ActionListener,MouseListener,MouseMotionListener{

	JButton Red, Blue , Gray , Olive, Wheat , Pink , Violet , DarkViolet , Cyan , Teal ,Orange , Brown, Black , Yellow , Lavender ,  Magenta , DarkRed , DarkBlue , LightGreen , Green;
	String DrawMode="";
	JButton DrawLine,DrawRect,DrawCircle,DrawRoundRect,Pencil,Eraser,Clear;
	Color color;
	Checkbox Fill;
	Point FirstPoint = new Point(0,0);
	Point SecondPoint = new Point(0,0);
	public void init{
		Color c1=new Color(243,247,252,255);
		
		setLayout(new BorderLayout());
		Panel CommandPanel=new Panel();
		CommandPanel.setLayout(new GridLayout(15,2,20,20));
		CommandPanel.setBackground(new Color(223,234,246,255));
		

		Red=new JButton();
		Red.setBackground(Color.red);	
		Red.setActionCommand("Red");
		Red.addActionListener(this);
		CommandPanel.add(Red);
		
		Blue=new JButton();
		Blue.setBackground(Color.blue);
		Blue.setActionCommand("Blue");
		Blue.addActionListener(this);
		CommandPanel.add(Blue);
		
		Gray=new JButton();
		Gray.setBackground(Color.gray);	
		Gray.setActionCommand("Gray");
		Gray.addActionListener(this);
		CommandPanel.add(Gray);

		Cyan=new JButton();
		Cyan.setBackground(Color.cyan);	
		Cyan.setActionCommand("Cyan");
		Cyan.addActionListener(this);
		CommandPanel.add(Cyan);
		
		Orange=new JButton();
		Orange.setBackground(Color.orange);	
		Orange.setActionCommand("Orange");
		Orange.addActionListener(this);
		CommandPanel.add(Orange);
		
		Black=new JButton();
		Black.setBackground(Color.black);	
		Black.setActionCommand("Black");
		Black.addActionListener(this);
		CommandPanel.add(Black);
		
		Yellow=new JButton();
		Yellow.setBackground(Color.yellow);	
		Yellow.setActionCommand("Yellow");
	   Yellow.addActionListener(this);
		CommandPanel.add(Yellow);
		
		Magenta=new JButton();
		Magenta.setBackground(Color.magenta);	
		Magenta.setActionCommand("Magenta");
	    Magenta.addActionListener(this);
		CommandPanel.add(Magenta);
		
		DarkRed=new JButton();
		DarkRed.setBackground(new Color(204,0,0));
		DarkRed.setActionCommand("DarkRed");
	    DarkRed.addActionListener(this);
		CommandPanel.add(DarkRed);
		
		DarkBlue=new JButton();
		DarkBlue.setBackground(new Color(0,0,204));
		DarkBlue.setActionCommand("DarkBlue");
	   DarkBlue.addActionListener(this);
		CommandPanel.add(DarkBlue);
		
		LightGreen=new JButton();
		LightGreen.setBackground(new Color(0,255,51));
		LightGreen.setActionCommand("LightGreen");
	   LightGreen.addActionListener(this);
		CommandPanel.add(LightGreen);
		
		Green=new JButton();
		Green.setBackground(Color.green);	
		Green.setActionCommand("Green");
		Green.addActionListener(this);
		CommandPanel.add(Green);
		
		Lavender=new JButton();
		Lavender.setBackground(new Color(230,230,250));
		Lavender.setActionCommand("Lavender");
	  Lavender.addActionListener(this);
		CommandPanel.add(Lavender);
		
		Brown=new JButton();
		Brown.setBackground(new Color(165,42,42));
		Brown.setActionCommand("Brown");
	  Brown.addActionListener(this);
		CommandPanel.add(Brown);
		
		Teal=new JButton();
		Teal.setBackground(new Color(0,128,128));
		Teal.setActionCommand("Teal");
	  Teal.addActionListener(this);
		CommandPanel.add(Teal);
		
		Violet=new JButton();
		Violet.setBackground(new Color(138,43,226));
		Violet.setActionCommand("Violet");
	  Violet.addActionListener(this);
		CommandPanel.add(Violet);
		
		DarkViolet=new JButton();
		DarkViolet.setBackground(new Color(75,0,130));
		DarkViolet.setActionCommand("DarkViolet");
	  DarkViolet.addActionListener(this);
		CommandPanel.add(DarkViolet);
		
		Wheat=new JButton();
		Wheat.setBackground(new Color(245,222,179));
		Wheat.setActionCommand("Wheat");
	  Wheat.addActionListener(this);
		CommandPanel.add(Wheat);
		
		Olive=new JButton();
		Olive.setBackground(new Color(128,128,0));
		Olive.setActionCommand("Olive");
	  Olive.addActionListener(this);
		CommandPanel.add(Olive);
		
		Pink=new JButton();
		Pink.setBackground(new Color(255,105,180));
		Pink.setActionCommand("Pink");
	  Pink.addActionListener(this);
		CommandPanel.add(Pink);
	
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
    if(DrawMode.equals("Red")){
			color=Color.red;
		}	
		if(DrawMode.equals("Blue")){
		color=Color.blue;
		}
		if(DrawMode.equals("Gray")){
			color=Color.gray;
		}
		if(DrawMode.equals("Cyan")){
			color=Color.cyan;
		}
		if(DrawMode.equals("Orange")){
			color=Color.orange;
		}
		if(DrawMode.equals("Black")){
			color=Color.black;
		}
		if(DrawMode.equals("Yellow")){
			color=Color.yellow;
		}
		if(DrawMode.equals("Magenta")){
			color=Color.magenta;
		}
		if(DrawMode.equals("DarkRed")){
			color=Color.new Color(204,0,0);
		}
			if(DrawMode.equals("DarkBlue")){
			color=Color.new Color(0,0,204);
		}
		if(DrawMode.equals("LightGreen")){
			color=Color.new Color(0,255,51);
		}
		if(DrawMode.equals("Green")){
			color=Color.green;
		}
		if(DrawMode.equals("Lavender")){
			color=Color.new Color(230,230,250);
		}
		if(DrawMode.equals("Brown")){
			color=Color.new Color(165,42,42);
		}
		if(DrawMode.equals("Teal")){
			color=Color.new Color(0,128,128);
		}
		if(DrawMode.equals("Violet")){
			color=Color.new Color(138,43,226);
		}
		if(DrawMode.equals("DarkViolet")){
			color=Color.new Color((75,0,130));
		}
		if(DrawMode.equals("Wheat")){
			color=Color.new Color(245,222,179);
		}
		if(DrawMode.equals("Olive")){
			color=Color.new Color((128,128,0));
		}
		if(DrawMode.equals("Pink")){
			color=Color.new Color((255,105,180));
		}
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