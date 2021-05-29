import java.sql.*;
import java.io.*;
public class db
{
public static void main(String [] args)
{
try
{
Class.forName("net.Ucanaccess.jdbc.UcanaccessDriver");
Connection c=DriverManager.getConnection("jdbc:Ucanaccess:F//Eclipse/stud//A1.accessDb);
Statement s=c.createStatement();
System.out.println("Connection established");
s.execute("create table data(name varchar,usn varchar,address varchar,phone number)");
System.out.println("Data inserted Successfully");
ResultSet r=s.executeQuery("Select from data");
System.out.println("The records in the table are:");
while(r.next())
{
String name=r.getString("name");
String usn=r.getString("usn");
String add=r.getString("address");
int numb=r.getString("phone");
System.out.println(name+ "," +usn+ "," +add+ "," +numb);
}
}
catch(Exception e)
{
System.out.println("e");
}
}
}
