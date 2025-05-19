package CreateStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoClass7 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/db";
		String UName = "root";
		String Password = "Sajet@1299";

		String Query = "delete from student  where SID=6";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, UName, Password);

		Statement s = con.createStatement(); // Create Statement
		int count = s.executeUpdate(Query);
		System.out.println(count + " : Rows Affectd");

		String Query1 = "select * from student";
		String Name;
		Statement s1 = con.createStatement();
		ResultSet RS = s1.executeQuery(Query1);

		while (RS.next()) {
			Name = RS.getInt(1) + " : " + RS.getString(2);
			System.out.println(Name);
		}

		s.close();
		con.close();
	}

}
