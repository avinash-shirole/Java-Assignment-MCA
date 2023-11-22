package gui.awt;
import java.awt.*;
public class DemoAWT1 extends Frame {

	void setLayout() {
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
        Label lb= new Label("Enter Name:");	
        Label lb2= new Label("Enter Password:");	
		TextField tf= new TextField();
		TextField tf2 =new TextField();
		tf.setBounds(20,120,150,30);
		tf2.setBounds(20,180,150,30);
		lb.setBounds(20, 90, 150, 30);
		lb2.setBounds(20,150,150,30);
		
		 Button bt= new Button("Log In");
		   bt.setBounds(20,220,80,30);
		   bt.setBackground(Color.green);
		   bt.setForeground(Color.white);
		
		add(lb);
		add(lb2);
		add(tf);
		add(tf2);
		add(bt);
	}
	public static void main(String[] args) {
		
		DemoAWT1 dawt= new DemoAWT1();
		dawt.setLayout();

	}

}
