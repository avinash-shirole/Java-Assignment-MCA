package gui.assign;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
public class ShowOrHideButton extends Frame implements ActionListener
{
	TextField tf;
	Button btn,btn1;
	ShowOrHideButton(){
		tf=new TextField();
		tf.setBounds(60, 50, 170,20);
		
	    btn= new Button("show");
		btn.setBounds(100, 120, 80, 30);
		
		btn1= new Button("hide");
		btn1.setBounds(20, 150, 80, 30);

		btn.addActionListener(this);
		btn1.addActionListener(this);
		
		add(btn);
		add(btn1);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	
	
	
	}

	public static void main(String[] args) {

		new ShowOrHideButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		Button b1=(Button) e.getSource();
		if(b1==btn) {
			tf.setText("Welcome");
		}
		if(b1==btn1) {
			tf.setText("");
		}
	}
	
}
