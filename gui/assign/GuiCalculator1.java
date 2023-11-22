package gui.assign;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GuiCalculator1 extends Frame{

	TextField tf1,tf2,result;
	Button btn1,btn2,btn3,btn4,btn5,calbtn;
	Label lb1,lb2,res;
	
	public GuiCalculator1(){
		
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
		
		
		
		    CalcutorDemo1 ob= new CalcutorDemo1(this);
		    btn1.addActionListener(ob);
			btn2.addActionListener(ob);
			btn3.addActionListener(ob);
			btn4.addActionListener(ob);
			btn5.addActionListener(ob);
		calbtn.addActionListener(ob);
		    
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

	

}
