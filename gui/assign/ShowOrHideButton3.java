package gui.assign;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
public class ShowOrHideButton3 extends Frame 
{
	TextField tf1;
	Button btn,btn1;
	ShowOrHideButton3(){
		tf1=new TextField();
		tf1.setBounds(60, 50, 170,20);
		
	    btn= new Button("show");
		btn.setBounds(100, 120, 80, 30);
		
		btn1= new Button("hide");
		btn1.setBounds(20, 150, 80, 30);

		ShowOrHideButton3Demo ob =new ShowOrHideButton3Demo(this);
		
		btn.addActionListener(ob);
		btn1.addActionListener(ob);
		add(btn);
		add(btn1);
		add(tf1);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	
		
		
	
	}


	public static void main(String[] args) {

		new ShowOrHideButton();
	}


	
	
}
