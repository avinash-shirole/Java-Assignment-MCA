package gui.assign;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GuiFontExample2 extends Frame {

	TextField tf;
	Label lb;
	Button bold,italic,b_I,plane,red ,green,blue,incrSize,decrSize;
	    

	
	public GuiFontExample2(){
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
	    
	    
	 GuiFontExample2Demo ob=new GuiFontExample2Demo(this); 
	 bold.addActionListener(ob);
	 italic.addActionListener(ob);
	 b_I.addActionListener(ob);
	 plane.addActionListener(ob);
	 red.addActionListener(ob);
	 green.addActionListener(ob);
	 blue.addActionListener(ob);
	 incrSize.addActionListener(ob);
	 decrSize.addActionListener(ob);
		
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

		new GuiFontExample2();
	}

	
	
	
	
	
	
	
	
	
		
		 
		
	}


