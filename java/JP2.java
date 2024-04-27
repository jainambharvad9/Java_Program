import javax.swing.*;

import javafx.scene.image.Image;

import java.awt.*;
import java.awt.event.*;


/*
 *      <applet code="JP2.class" height = 1000 width = 1000>
 * </applet>
 */
public class JP2 extends JApplet
implements ActionListener{
    JCheckBox ch1,ch2,ch3;
    JButton btn1;
    ImageIcon  img1;
    public void init(){
        ch1 = new JCheckBox("Mu ");
        ch2= new JCheckBox("password");
        ch3 = new JCheckBox("Ans");


        img1= new ImageIcon("img1.jpg");
        btn1 = new JButton(img1);
      
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(ch1);add(ch2);add(ch3);add(btn1);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub


        
    }
}