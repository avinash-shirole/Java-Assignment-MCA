package gui.awt;

import java.awt.Button;
import java.awt.*;
import java.awt.TextField;

public class Table extends Frame{
	TextField tf,tf1;
	
	Table(){
		tf=new TextField();
		tf.setBounds(60, 50, 170, 20);
		
		tf1=new TextField();
		tf1.setBounds(60, 100, 170, 20);
		
		
		Button bt= new Button("Generate Table");
		bt.setBounds(100, 120, 120, 30);
		
		
		GenTables gt=new GenTables(this);
		bt.addActionListener(gt);
		
		add(bt);
		add(tf);
		add(tf1);
		setSize(300,200);
		setLayout(null);
		setTitle("Table Generator");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Table();
	}

}
