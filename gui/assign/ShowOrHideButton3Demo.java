package gui.assign;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowOrHideButton3Demo implements ActionListener{
	ShowOrHideButton3 obj;
	
	ShowOrHideButton3Demo(ShowOrHideButton3 obj){
		this.obj=obj;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Button b1=(Button) e.getSource();
		if(b1==obj.btn) {
			obj.tf1.setText("Welcome");
		}
		if(b1==obj.btn1) {
			obj.tf1.setText("");
		}
		
	}
	
}
