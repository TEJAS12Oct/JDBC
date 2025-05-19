package JDBCDoa2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDoa {

	public void addStudent(Student s1) throws Exception {
		String url = "jdbc:mysql://localhost:3306/DB";
		String UName = "root";
		String Password = "Sajet@1299";
		String Query = "insert into  Student values (?,?)";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, UName, Password);

		PreparedStatement PT = con.prepareStatement(Query);
		PT.setInt(1, s1.SID);
		PT.setString(2, s1.SName);
		PT.executeUpdate();
	}

}
