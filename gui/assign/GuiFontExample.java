package gui.assign;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GuiFontExample extends Frame implements ActionListener{

	TextField tf;
	Label lb;
	Button bold,italic,b_I,plane,red ,green,blue,incrSize,decrSize;
	int size;
	Font font;    

	
	public GuiFontExample(){
		lb=new Label("Enter Text:");
		tf=new TextField();
		tf.setBounds(60, 50, 170,20);
		
		bold=new Button("Bold");
		italic=new Button("italic");
		b_I=new Button("B&I");
		plane=new Button("plane");
		red=new Button("Red");
		green=new Button("Green");
		blue=new Button("Blue");
		incrSize=new Button("++");
		decrSize=new Button("--");
		
		
		
		


		lb.setBounds(800,100,200,30);
		tf.setBounds(900,100,200,30);
		bold.setBounds(500, 270, 100, 30);
	    italic.setBounds(650, 270, 100, 30);
	    b_I.setBounds(800, 270, 100, 30);
	    plane.setBounds(950, 270, 100, 30);
	    red.setBounds(1100, 270, 100, 30);
	    green.setBounds(1250,270,100,30);
	    blue.setBounds(1400,270,100,30);
	    incrSize.setBounds(1000,400,100,30);
	    decrSize.setBounds(1150,400,100,30);
	    
	    
	    bold.addActionListener(this);
	    italic.addActionListener(this);
	    b_I.addActionListener(this);
	    plane.addActionListener(this);
	    red.addActionListener(this);
	    green.addActionListener(this);
	    blue.addActionListener(this);
	    incrSize.addActionListener(this);
	    decrSize.addActionListener(this);
		
		add(tf);add(lb);
		add(bold);
		add(italic);
		add(b_I);
		add(plane);
		add(red);
		add(green);
		add(blue);
		add(decrSize);
		add(incrSize);
		
		
		setSize(1900,700);
		setTitle("FontExample");
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {

		new GuiFontExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String text= tf.getText();
		String bn=e.getActionCommand();
		
	if(bn.equals("Bold")) {
		tf.setText(text);
		font=new Font("Courier", Font.BOLD, 20);
		tf.setFont(font);
		
	}
	else if(bn.equals("italic")) {
		tf.setText(text);
		font=new Font("Courier", Font.ITALIC, 20);
		tf.setFont(font); 
		
	}
	else if(bn.equals("B&I")) {
		tf.setText(text);
		font=new  Font("Arial",Font.BOLD,20);
		tf.setFont(font);
		
		
	}
	else if(bn.equals("plane")) {
		tf.setText(text);
		font=new Font("Courier", Font.PLAIN, 20);
		tf.setFont(font);
		
	}
	
	else if(bn.equals("Red"))
	{
		tf.setText(text);
		tf.setForeground(Color.RED);
		
	}
	else if(bn.equals("Blue")) {
		tf.setText(text);
		tf.setForeground(Color.BLUE);
		
	}
	else if(bn.equals("Green"))
	{
		tf.setText(text);
		tf.setForeground(Color.GREEN);
		
	}
	else if(bn.equals("--")) {
		size=size-2;
		tf.setText(text);
		font=new Font("Courier", Font.PLAIN, size);
		tf.setFont(font);
		
	}
	else if(bn.equals("++")) {
		size=size+2;
		tf.setText(text);
		font=new Font("Courier", Font.PLAIN, size);
		tf.setFont(font);
		
	}
		
		 
		
	}

}
