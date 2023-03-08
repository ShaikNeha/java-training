import java.sql.*;
 class OracleConInsert
{
	public static void main(String args[])
	{
	try
{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcaa2229","mtcaa2229");
		
		Statement stmt=con.createStatement();
		String s;
		s="insert into student"+"(rollno,sname,age)"+"values(21,'test',31)";
		ResultSet rs=stmt.executeQuery(s);
		stmt.executeUpdate(s);
		System.out.println("one recodr inserted");
		con.close();
}
		catch(Exception e)
	{
			System.out.println(e);
	}
	}
}

