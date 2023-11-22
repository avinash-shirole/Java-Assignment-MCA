package gui.awt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GenTables implements ActionListener {
	
	Table obj;
	
	public GenTables(Table obj) {
		this.obj=obj;
	}
	
	public void actionPerformed(ActionEvent e) {
		String s="";
		int n = Integer.parseInt(obj.tf.getText());
		
		for(int i=1;i<=10;i++) {
			s+=","+(n*i);
		}
		obj.tf1.setText(s);
	}
}
