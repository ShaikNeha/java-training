import java.sql.*;
 class OracleConInsert1
{
	public static void main(String args[])
	{
	try
{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcaa2229","mtcaa2229");
		
		Statement stmt=con.createStatement();
		String s;
		s="insert into emp"+"(idno,sname,age)"+"values(2223,'neha',24)";
		s="insert into emp"+"(idno,sname,age)"+"values(2224,'zehara',25)";

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
