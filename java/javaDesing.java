/*
 1)awt Abstract window tookit it used to create gui control like text box lable ,button tec,
 * lable 1=== it is used to diplay text msg 
 * syn= lable (string text)
2)text field== it is used to input data from user it is like text box cotrol 
  syn== constructor 
  textfield(string msg)
 textfield(int noofchar)
 textfield 

3)button== it is used to submit data
syn- button string text

EX:- 
enter no 1:{    }
enter no 2:[   ]
*/

/*
 *      <applet code="javaDesing.class" width="500" height="500"></applet>
 */
import java.applet.*;
import java.awt.*;
import java.util.*;

import javafx.scene.control.TextField;


public class javaDesing extends Applet{
    Label lb1,lb2,lb3;
    Component tf1;
    TextField tf2;
    Button bt1;

    public void init(){
        lb1 = new Label("Enter No 1:");
        lb2= new Label("ABC");
        lb3 = new Label("Aws");

        tf1 = new TextField();
        tf2 = new TextField();

        bt1 = new Button("Submit");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(lb1);add(tf1);
        add(lb2);add(tf2);
        add(bt1);add(lb3);





        
    }
}



