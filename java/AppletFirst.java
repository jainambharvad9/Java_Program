/*
 * Applet
 *      -> Applet is dif from the applicstion , it is  aGUI based java program that runs on the internet by a java powered browser.
 *      -> An Applet is source as it dose not let your complate to be infected by virus.
 *      -> The Applet calss withch is an java.applet pack... is used tp create an applet.
 * 
 *      
 */

 /*
  *         <applet code="AppletFirst.class" width="500" height="500"> </applet>
  */
import java.applet.*;
import java.awt.*;
import java.util.*;

import javafx.geometry.Dimension2D;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;;



public class AppletFirst extends Applet{
    public void paint(Graphics g){ 
        Dimension2D d = getSize();
        int width= d.getWidth;
        int height = d.getHeight;
        int x= width/2 - 100;
        int y= height/2 - 100;

        g.drawOval(x, y, 200, 200);


         g.drawLine(0,0,500,500);
         g.drawLine(0,500,500,0);
     g.drawLine(250,0,250,500);
          g.drawLine(0,250,500,250);
         g.drawLine(250,0,0,250);
      g.drawLine(500,250,250,500);
          g.drawLine(250,0,500,250);
    //     g.drawLine(0,250,250,500);


        // for(int i=1;i<=250;i++){
        //     g.drawRect(20+i, 20+i, 460-i*2, 460-i*2);
        // }
        // g.drawLine(150,150,150,250);
        // g.drawLine(150,250,350,350);
        // g.drawLine(350,250,350,350);
        // g.drawLine(250,150,350,150);
        // g.drawLine(250,150,250,350);
        // g.drawLine(150,350,250,350);
        // g.drawLine(250,0,500,250);
        // g.drawLine(0,250,250,500);

      

        // g.drawArc(150, 150, 200, 200,0,180);
        // g.drawArc(150, 150, 200, 200,270,0);

            // g.drawOval(50, 50, 400, 400);
            // g.drawOval(150, 170, 80,80);
            // g.drawOval(270, 170, 80,80);


        //     // g.drawArc(150, 150, 200, 200,180,0);
        //     g.setColor(java.awt.Color.RED);
        // g.draw3DRect(200, 405, 400, 100);  
        // g.fillRect(355, 250, 100, 400);
      


            //100,100,300,300
            // //170,1
            // g.setColor(java.awt.Color.RED);
            // int x[] =  {150,350,450,350,150,50,150};
            // g.setColor(java.awt.Color.BLUE);
            // int y[]=  {150,150,250,350,350,250,150};
            // g.drawPolygon(x,y,7);



            // g.setColor(Color.blue);

            // int x1[]= {250,400,100,250};
            // int y1[]= {50,350,350,50};
           
            // int x2[] = {100,400,250,100};
            // int y2[] ={150,150,450,150};

            // g.fillPolygon(x1,y1,4);
            // g.setColor(Color.red);
            // g.fillPolygon(x2,y2,4);

            // for(int i=1;i<=250;i++){

            //     Random r = new Random();
            //     int red = r.nextInt(255);
            //     int green = r.nextInt(255);
            //     int blue = r.nextInt(255);

            //     Color c = new Color(red, green, blue);
            //     g.setColor(c);
            //         g.fillRect(20+i, 20+i, 460-i*2, 460-i*2);

            //      }


            //Demo 42

            // Font f= new Font("Magneto",Font.BOLD,50);
            // g.setFont(f);
            // g.drawString("WLCM", 50, 50);


    }
   
        
}

