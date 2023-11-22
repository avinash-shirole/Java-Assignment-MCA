package gui.assign;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcutorDemo1 implements ActionListener{

	GuiCalculator1 ob;
	
	CalcutorDemo1(GuiCalculator1 ob){
		this.ob=ob;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		int num1=Integer.parseInt(ob.tf1.getText());
		int num2=Integer.parseInt(ob.tf2.getText());
		
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
		ob.result.setText(" "+res);
		
	}
}
