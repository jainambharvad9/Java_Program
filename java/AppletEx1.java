/*
  *         <applet code="AppletFirst.class" width="500" height="500"> </applet>
 */

import java.applet.*;
import java.awt.*;

public class AppletEx1 {

public void paint(Graphics g){



        //patag banavanu 
        //g.drawLine("250,150,250,250");

        //circle 
       // g.drawOval(150,150,200,200);
       // g.drawRect(150,250,200,200);
        g.drawOval(150,150,300,100);

        for(int i=1;i<=250;i++){
            g.drawLine(20+i, 20+i, 460-i*2, 460-i*2);
        }
    
        
    }

}

