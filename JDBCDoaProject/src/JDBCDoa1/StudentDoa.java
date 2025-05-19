package JDBCDoa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDoa {

	public Student getStudent(int SId) throws Exception {

		try {
			String url = "jdbc:mysql://localhost:3306/DB";
			String UName = "root";
			String Password = "Sajet@1299";
			String Query = "select SName from student where SID=" + SId;

			Student s = new Student();
			s.SId = SId;

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, UName, Password);

			Statement st = con.createStatement();
			ResultSet RS = st.executeQuery(Query);
			RS.next();
			s.Sname = RS.getString(1);
			return s;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

}
