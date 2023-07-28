import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;

public class Paint extends Applet implements ActionListener,MouseListener,MouseMotionListener{
		JButton Red;
		Color color;
		String DrawMode = ""
	public void init(){	
		setLayout(new BorderLayout());
		Panel CommandPanel=new Panel();
		CommandPanel.setLayout(new GridLayout(15,2,20,20));
		CommandPanel.setBackground(new Color(223,234,246,255));
		
	
}