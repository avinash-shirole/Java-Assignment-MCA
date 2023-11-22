package gui.awt;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
public class DemoEvent1 extends Frame {
	TextField tf;
	
	DemoEvent1(){
		tf=new TextField();
		tf.setBounds(60, 50, 170,20);
		
		Button btn= new Button("show");
		btn.setBounds(100, 120, 80, 30);
		
		DemoEvent2 de2=new DemoEvent2(this);
		
		btn.addActionListener(de2);//passing instance of outer class
		
		add(btn);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {

		new DemoEvent1();
	}

}
