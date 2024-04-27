/*
 *    <applet code="AppletSymbol.class" width="500" height="500"> </applet>
 */
import java.applet.*;
import java.awt.*;

import javafx.scene.paint.Color;

public class AppletSymbol{
    public void paint(Graphics g){
        g.setColor(java.awt.Color.CYAN);
        g.fillRect(200, 100, 400, 200);    
    }
}