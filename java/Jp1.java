import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/*
 *      <applet code="Japplet.class" height = 500 width = 500>
 * </applet>
 */
public class Jp1 extends JApplet
implements ActionListener {
        JLabel lb1,lb2,lb3;
        JTextField username;
        JPasswordField pwd;
        JButton btn1;

        public void init(){

            lb1 = new JLabel("Username");
            lb2 = new JLabel("Password");
            lb3 = new JLabel("ANS");

            username = new JTextField(20);
            pwd = new JPasswordField(20);

            btn1 = new JButton(" Login");

            setLayout(new FlowLayout(FlowLayout.LEFT));

            add(lb1); 
            add(lb2);
            
        }

        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
        }

        
            
        }

