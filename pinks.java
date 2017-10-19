
//displaying various color in the flow and showing status of colour clicked
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Pinks extends Applet implements ActionListener
{
Button b1,b2,b3;
public void init()
{
b1=new Button("pink");
b2=new Button("green");
b3=new Button("yellow");
add(b1);add(b2);add(b3);
setLayout(null);
b1.setBounds(140,220,40,20);b2.setBounds(200,220,40,20);b3.setBounds(260,220,40,20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
showStatus("pink is clicked");
setBackground(Color.green);
}
if(ae.getSource()==b2)
{
showStatus("green is clicked");
setBackground(Color.yellow);
}
if(ae.getSource()==b3)
{
showStatus("yellow is clicked");
setBackground(Color.pink);
}
}
}
//<applet code=Pinks width=500 height=500></applet> 