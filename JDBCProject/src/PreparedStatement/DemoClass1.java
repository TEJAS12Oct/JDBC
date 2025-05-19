package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoClass1 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/db";
		String UName = "root";
		String Password = "Sajet@1299";

		int SId = 6;
		String SName = "Janhavi";
		String Query = "insert into student values (? ,?)";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, UName, Password);

		PreparedStatement s = con.prepareStatement(Query); // Prepared Statement
		s.setInt(1, SId);
		s.setString(2, SName);

		int count = s.executeUpdate(); // In Prepared statement Don't Pass Query in Parameter
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
