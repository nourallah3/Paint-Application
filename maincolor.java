import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;

public class Paint extends Applet implements ActionListener,MouseListener,MouseMotionListener{
		JButton Red, Blue;
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

		
		public void actionPerformed(ActionEvent e){
		DrawMode = e.getActionCommand();
		Graphics g = getGraphics();
		
		if(DrawMode.equals("Red")){
			color=Color.red;
		}	
		if(DrawMode.equals("Blue")){
			color=Color.blue;
		}
	}

		
	public void paint(Graphics g){
		g.setColor(color);
	}

}
}