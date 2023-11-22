package gui.assign;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
public class ShowOrHideButton2 extends Frame 
{
	TextField tf1;
	Button btn,btn1;
	ShowOrHideButton2(){
		tf1=new TextField();
		tf1.setBounds(60, 50, 170,20);
		
	    btn= new Button("show");
		btn.setBounds(100, 120, 80, 30);
		
		btn1= new Button("hide");
		btn1.setBounds(20, 150, 80, 30);

		
		
		add(btn);
		add(btn1);
		add(tf1);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				
					tf1.setText("Welcome");
			}	
		});
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				
					tf1.setText("");
			}	
		});
	
	}


	public static void main(String[] args) {

		new ShowOrHideButton();
	}


	
}
