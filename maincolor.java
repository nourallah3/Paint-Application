import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;

public class Paint extends Applet implements ActionListener,MouseListener,MouseMotionListener{
		JButton Red, Blue , Gray , Cyan , Orange , Black , Yellow , Magenta , DarkRed , DarkBlue , Lightgreen;
		Color color;
		String DrawMode = ""
	public void init(){	
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
		
		Lightgreen=new JButton();
		Lightgreen.setBackground(new Color(0,255,51));
		Lightgreen.setActionCommand("Lightgreen");
	    Lightgreen.addActionListener(this);
		CommandPanel.add(Lightgreen);
		
		public void actionPerformed(ActionEvent e){
		DrawMode = e.getActionCommand();
		Graphics g = getGraphics();
		
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
		if(DrawMode.equals("Lightgreen")){
			color=Color.new Color(0,255,51);
		}
	}
	
	public void paint(Graphics g){
		g.setColor(color);
	}

}
}