//all math operation pgm
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Adds extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5;
public void init()
{
setBackground(Color.blue);
l1=new Label("value1");t1=new TextField(20);
l2=new Label("value2");t2=new TextField(20);
l3=new Label("value3");t3=new TextField(20);
b1=new Button("add");
b2=new Button("sub");
b3=new Button("mul");
b4=new Button("div");
b5=new Button("clear");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(b2);add(b3);add(b4);add(b5);
setLayout(null);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
l3.setBounds(100,180,100,20);t3.setBounds(220,180,100,20);
b1.setBounds(140,220,40,20);b2.setBounds(200,220,40,20);b3.setBounds(260,220,40,20);b4.setBounds(320,220,40,20);b5.setBounds(380,220,40,20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int a,b,c;
if(ae.getSource()==b1)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
t3.setText(String.valueOf(c));
showStatus("addition performed");
}
if(ae.getSource()==b2)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a-b;
t3.setText(String.valueOf(c));
showStatus("subtraction performed");
}
if(ae.getSource()==b3)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a*b;
t3.setText(String.valueOf(c));
showStatus("multiplication performed");
}
if(ae.getSource()==b4)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a/b;
t3.setText(String.valueOf(c));
showStatus("division performed");
}
if(ae.getSource()==b5)
{
t1.setText("");
t2.setText("");
t3.setText("");
t1.requestFocus();
showStatus("clear performed");
}
}
}

//<applet code=Adds width=500 height=500></applet> 
