package CreateStatement;
import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/db";
		String UName = "root";
		String Password = "Sajet@1299";
		String Query = "select s.SName from student s where s.SId =2";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,UName,Password);
		
		Statement  s = con.createStatement();
		 ResultSet RS= s.executeQuery(Query);
		 RS.next();
		 String Name =  RS.getString("s.SName");
		 System.out.println(Name);
		 
		 s.close();
		 con.close();
	}

}
