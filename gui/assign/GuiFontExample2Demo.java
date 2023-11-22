package gui.assign;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class GuiFontExample2Demo implements ActionListener{

	GuiFontExample2 ob;
	Font font;
	int size;
	
	GuiFontExample2Demo(GuiFontExample2 ob){
		this.ob=ob;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String text= ob.tf.getText();
		String bn=e.getActionCommand();
		
	if(bn.equals("Bold")) {
		ob.tf.setText(text);
		font=new Font("Courier", Font.BOLD, 20);
		ob.tf.setFont(font);
		
	}
	else if(bn.equals("italic")) {
		ob.tf.setText(text);
		font=new Font("Courier", Font.ITALIC, 20);
		ob.tf.setFont(font); 
		
	}
	else if(bn.equals("B&I")) {
		ob.tf.setText(text);
		font=new  Font("Arial",Font.BOLD,20);
		ob.tf.setFont(font);
		
		
	}
	else if(bn.equals("plane")) {
		ob.tf.setText(text);
		font=new Font("Courier", Font.PLAIN, 20);
		ob.tf.setFont(font);
		
	}
	
	else if(bn.equals("Red"))
	{
		ob.tf.setText(text);
		ob.tf.setForeground(Color.RED);
		
	}
	else if(bn.equals("Blue")) {
		ob.tf.setText(text);
		ob.tf.setForeground(Color.BLUE);
		
	}
	else if(bn.equals("Green"))
	{
		ob.tf.setText(text);
		ob.tf.setForeground(Color.GREEN);
		
	}
	else if(bn.equals("--")) {
		size=size-2;
		ob.tf.setText(text);
		font=new Font("Courier", Font.PLAIN, size);
		ob.tf.setFont(font);
		
	}
	else if(bn.equals("++")) {
		size=size+2;
		ob.tf.setText(text);
		font=new Font("Courier", Font.PLAIN, size);
		ob.tf.setFont(font);
		
	}
		
		 
		
	}

}
