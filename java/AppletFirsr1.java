import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
/*
<applet code="AppletFirst.class" width="500" height="500"> </applet>
 */
public class AppletFirsr1 extends Appplet implements ActionListener{
    public void init(){
        List country = new List();
        country.add("Ind");
        country.add("USA");
        country.add("China");
        country.add("Bangladesh");
        

        Choice city = new Choice();
        city.add("Snagar");
        city.add("Gj1");
        city.add("Rajkot");
        city.add("Surat");

        address = new TextArea();
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add.(country);
        add.(city);
        add.(address);
    }


    public void actionPerformed(ActionEvent) {
        
    }

        

        


