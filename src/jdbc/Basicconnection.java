package jdbc;
import java.sql.*;
import java.io.*;
public class Basicconnection 
{

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.jdbc.Driver");
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skytech","root", "root");
	/* Statement stmt= con.createStatement();
	ResultSet rs =stmt.executeQuery("select * from buyer");
	while(rs.next())
		System.out.println(rs.getString(2));
	con.close(); */
/* PreparedStatement ps = con.prepareStatement("insert into buyer values(?,?,?)");	
ps.setString(1, "F1105");
ps.setString(2, "Jack");
ps.setInt(3, 51);
*/
/*  String sql = "update buyer set flat_no = ? where name=? ";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, "B201");
pst.setString(2, "Ajay");*/
/* String sql = " ALTER TABLE  buyer ADD amount int";	
PreparedStatement psmt = con.prepareStatement(sql);
int rowsaffected =psmt.executeUpdate();
System.out.println(rowsaffected); */
	String sql1= "select * from buyer";
	PreparedStatement psmt1= con.prepareStatement(sql1);
	ResultSet rs =psmt1.executeQuery();
	ResultSetMetaData rsmd= rs.getMetaData();

System.out.println("Total columns: "+rsmd.getColumnCount()); 
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(4));
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(4));
System.out.println("Name of table: "+ rsmd.getTableName(2));
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
