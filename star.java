// 8.Write an applet program to display a star.


import java.applet.*;
import java.awt.*;
public class star extends Applet{
    public void paint(Graphics g){
            g.drawLine(50, 50, 250, 150);
            g.drawLine(250, 150, 50, 200);
            g.drawLine(50, 200, 168, 45);
            g.drawLine(168, 45, 168, 250);
            g.drawLine(168, 250, 50, 50);

    }
}
//<applet code="star.java" width=600 height=600></applet>
