/*Action Lisiner  
 * The Event Lisitener Interface
 * 1) ActionLisitener : this interface is for action events .it has one method 
 * actionperformed which called when an action event is generated
 * 
 * 2) ItemListener : This interface has one method which is called when state of an item is chaged such as checkbox 
 *  this method is 
 * public void itemStatechanged (ItemEvent e){
 * }
 * 
 * 3) FocusListener : it has two method are when a components get ot lost focus.
 * 
 * public void focusGained(FocusEvent e){
 * }
 * 
 * public void focusLost(FocusEvent e){
 * }
 * 
 * 4) AdjustmentListener : this interface is foradjustment events. it has one method .which is called 
 * when the scrollbar is adjusted
 * public void adjusementValueChanged(AdjustmentEvent e){
 * }
 * 
 * 5) ketListener : this interface has three method which are called when a keyboard is generated 
 * 
 * public void KeyPressed keyRelealsed KeyTyped(KeyEvent e){
 * }
 * 6) MouseListener : this interface has five method which  arev called when a mouse event 
 * 
 * public void MousePressed MouseReleased MouseClicked MouseEntered mouseExited(MouseEvent e){
 * }
 * 
 * 
 * 7) MousemotListener 
 * 
 * 
 * 
 * public void MouseMoved Mouse(MouseEvent e){
 * }
 * 
 * 8) textListener : this interface has one method which is caaled when text changed 
 * 
 * public void textChanged(TextEvent] e){
 * }
 * 
 * 
 * 9) windowsListener : this has seven method 
 * 
 * public void windowActivated windowDeactvated windowClosing WindowCloed windowiconfield
 * windowDeiconfield(FocusEvent e){
 * }
 * 
 * 
 * 
 * 
 * 
*/

import java.awt.*;
import java.awt.event.*;
import javafx.event.ActionEvent;
/*
 *  <applet code=Demo51 height=500 width=500></applet>
 */



public class Demo51 extends JApplet implements ActionListener {

    JLabel lb1;
    JButton btn1;
    
    public void init(){
        btn1 = new JButton(" Click ");
        lb1 = new JLabel(" See result here ");
        setLayout(new FlowLayout());
        add(btn1); add(lb1);
        btn1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        lb1.setText("Jainam Bharvad");
    }
}
