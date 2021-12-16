import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class C_1_Arithmetic extends JFrame implements ActionListener
{
JTextField v1,op,v2,res;
JButton b;
JLabel l1,l2,l3,l4;
C_1_Arithmetic()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());
l1=new JLabel("Number 1");
l2=new JLabel("Operation");
l3=new JLabel("Number 2");
l4=new JLabel("Result");
v1=new JTextField("",5);
op=new JTextField("",1);
v2=new JTextField("",5);
res=new JTextField("",5);
b=new JButton("=");
c.add(l1);
c.add(v1);
c.add(l2);
c.add(op);
c.add(l3);
c.add(v2);
c.add(b);
c.add(l4);
c.add(res);
b.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand()=="=")
{
try
{
char operator=op.getText().charAt(0);
int r=0,num1=0,num2=0;
num1=Integer.parseInt(v1.getText());
num2=Integer.parseInt(v2.getText());

switch(operator)
{
case '+': r=num1+num2;
break;
case '-': r=num1-num2;
break;
case '*': r=num1*num2;
break;
case '/': r=num1/num2;
break;

}
res.setText(""+r);
}
catch(ArithmeticException e1)
{
JOptionPane.showMessageDialog(null,"ArithmeticException");
res.setText("");
}
catch(NumberFormatException e1)
{
JOptionPane.showMessageDialog(null,"NumberFormatException");
res.setText("");
}
}
}
public static void main(String args[])
{
C_1_Arithmetic ob = new C_1_Arithmetic();
ob.setSize(800,600);
ob.setVisible(true);
ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}