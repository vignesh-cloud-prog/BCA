import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

class UserList extends JFrame
{
DefaultTableModel model = new DefaultTableModel();
Container cnt= this.getContentPane();
JTable jtbl= new JTable(model);
public UserList()
{
cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
model.addColumn("Last name");
model.addColumn("First name");
model.addColumn("Tel No");
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con= DriverManager.getConnection("jdbc:odbc:Tel");
PreparedStatement pstm= con.prepareStatement("SELECT * FROM tel");
ResultSet Rs = pstm.executeQuery();
while(Rs.next()){
model.addRow(new Object[]
{
Rs.getString(1),Rs.getString(2),Rs.getString(3)
});
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
JScrollPane pg= new JScrollPane(jtbl);
cnt.add(pg);
this.pack();
}
}
public class C_5_Tabel
{
public static void main(String args[])
{
JFrame frame= new UserList();
frame.setTitle("Swing example");
frame.setSize(500,300);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
