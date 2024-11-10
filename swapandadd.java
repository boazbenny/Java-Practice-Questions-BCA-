// 6. Write a program using swing to accept values in two textboxes then swap the numbers when you click on swap button and add the numbers when you click on add button.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swapandadd extends JApplet implements ActionListener{

    JTextField t1,t2,t3;
    JButton b1,b2,b3;
    int n1,n2;
    public void init(){
        Container contentPane=getContentPane();
        contentPane.setLayout(new FlowLayout());
        t1=new JTextField(20);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1=new JButton("Swap");
        b2=new JButton("Add");
        b3=new JButton("=");
        b1.addActionListener(this);
        b2.addActionListener(this);
        contentPane.add(t1);
        contentPane.add(t2);
        contentPane.add(b3);
        contentPane.add(t3);
        contentPane.add(b1);
        contentPane.add(b2);  
    }
   
    public void actionPerformed(ActionEvent e) {
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            String command= e.getActionCommand();
            if(command.equals("Swap")){
                int n3;
                n3=n1;
                n1=n2;
                n2=n3;
                t1.setText(String.valueOf(n1));
                t2.setText(String.valueOf(n2));
            }
            else if(command.equals("Add")){
                int sum=n1+n2;
                t3.setText(String.valueOf(sum));

            }
    }

}
//<applet code="swapandadd.java" width=500 height=500></applet>
