package gui.assign;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GuiCalculator extends Frame implements ActionListener{

	TextField tf1,tf2,result;
	Button btn1,btn2,btn3,btn4,btn5,calbtn;
	Label lb1,lb2,res;
	
	public GuiCalculator(){
		lb1=new Label("Enter First NO:");
		lb1.setBounds(500,80,100,30);
		tf1=new TextField();
		tf1.setBounds(630,80,150,30);
		
		lb2=new Label("Enter second NO:");
		lb2.setBounds(500,150,120,30);
		tf2=new TextField();
		tf2.setBounds(630,150,150,30);
		
		res=new Label("Result");
		res.setBounds(500,200,120,30);
		result=new TextField();
		result.setBounds(630,210,150,30);
		
		
		btn1=new Button("+");
		btn2=new Button("-");
		btn3=new Button("*");
		btn4=new Button("/");
		btn5=new Button("%");
		calbtn=new Button("Calculate");
		
		  btn1.setBounds(500, 270, 100, 30);
		    btn2.setBounds(650, 270, 100, 30);
		    btn3.setBounds(800, 270, 100, 30);
		    btn4.setBounds(950, 270, 100, 30);
		    btn5.setBounds(1100, 270, 100, 30);
		    calbtn.setBounds(1200,270,100,30);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
	calbtn.addActionListener(this);
		
		
		add(tf1);add(tf2);add(result);
		add(lb1);add(lb2);add(res);
		add(btn1);add(btn2);add(btn3);add(btn4);add(btn5);add(calbtn);
		
		setSize(1900,700);
		setTitle("Calculator");
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	 new GuiCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		int num1=Integer.parseInt(tf1.getText());
		int num2=Integer.parseInt(tf2.getText());
		
		String bn=e.getActionCommand();
		
		int res=0;
		if(bn.equals("+")) {
			res=(num1+num2);
		}
		else if(bn.equals("-")) {
			res=(num1-num2);
		}
		else if(bn.equals("*")) {
			res=(num1*num2);
		}
		else if(bn.equals("/")) {
			res=(num1/num2);
		}
		else if(bn.equals("%")) {
			res=(num1%num2);
		}
		result.setText(" "+res);
		
	}

}
