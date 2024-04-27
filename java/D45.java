/* <Applet code=* D45.class"width="500" height="500"></Applet>*/



import.java.util.*;
import.java.awr.*;
import.java.awt.event.*;

public class D45 extends Applet implements ActionListener {
	//radio button
				CheckBox cb1,cb2,cb3;
				CheckboxGroup cg1;
	//checkbox
				Checkbox cb4,cb5;
				
				public void init(){
				cg1 = new CheckBox();
				cb1 = new CheckBox("OBC",cg1.false);
				cb2 = new CheckBox("GEN",cg2.true);
				cb3 = new CheckBox("ST",cg3.false);
				
				cb4 = new Checkbox("SPO");
				cb5 = new Checkbox("MUS");
				
				setLayout(new FlowLayout(FlowLayout.LEFT));
				
				add(cb1);add(cb2);add(cb3);
				add(cb4);add(cb5);
				
				}
				public void actionPerfromed(ActionEvent e);
}
}
