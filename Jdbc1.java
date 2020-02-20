package sql;
import java.sql.*;
public class Jdbc1 
{
public static void main(String[] args)throws SQLException {
	Connection con=null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","root");
		System.out.println("Connected");
		PreparedStatement ps=con.prepareStatement("insert into emp values (846767,'SHIVA THULU',50000,4)");
		ps=con.prepareStatement("insert into emp values (846768,'AKSHAY RAJAN',60000,5)");
		ps=con.prepareStatement("delete from emp where emp_no=846764");
		ps.executeUpdate();
		ps.close();
		ps=con.prepareStatement("select * from emp");
	ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("emp_no"));
				System.out.println(rs.getString("emp_name"));
				System.out.println(rs.getFloat("emp_sal"));
			} 
	}
	catch(SQLException | ClassNotFoundException se)
	{
		System.out.println(se);
	}
	finally
	{
		con.setAutoCommit(false);
		con.commit();
	}
}
}
