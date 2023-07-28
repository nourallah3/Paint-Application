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
		