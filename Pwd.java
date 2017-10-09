
//login pgm...
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Pwd extends Applet implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1,b2;
public void init()
{
setBackground(Color.red);
l1=new Label("username");
t1=new TextField(20);
l2=new Label("password");
t2=new TextField(20);
t2.setEchoChar('*');
b1=new Button("login");
b2=new Button("clear");
add(l1);add(t1);
add(l2);add(t2);
add(b1);add(b2);
setLayout(null);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
b1.setBounds(140,220,40,20);b2.setBounds(200,220,40,20);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{
String a=t1.getText();
String b=t2.getText();
if(a.equals("laksh")&& b.equals("simren"))
{
showStatus("login successfull");
}
else
{
showStatus("invalid un or pwd");
}
}
if(ae.getSource()==b2)
{
t1.setText("");
t2.setText("");
showStatus("clearedd...");
}
}
}
//<applet code=Pwd width=500 height=500></applet>


