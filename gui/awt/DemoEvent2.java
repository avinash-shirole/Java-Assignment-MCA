package gui.awt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DemoEvent2  implements ActionListener{

	DemoEvent1 ob;
	
	DemoEvent2(DemoEvent1 ob){
		this.ob=ob;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ob.tf.setText("Welcome...");
		
	}

}
