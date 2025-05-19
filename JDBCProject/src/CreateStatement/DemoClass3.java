package CreateStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoClass3 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/db";
		String UName = "root";
		String Password = "Sajet@1299";
		String Query = "select * from student";

		String Name;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, UName, Password);

		Statement s = con.createStatement();
		ResultSet RS = s.executeQuery(Query); // DQL Operation : Select 

		while (RS.next()) {
			Name = RS.getInt(1) + " : " + RS.getString(2);
			System.out.println(Name);
		}

		s.close();
		con.close();
	}

}


//DQL	Data Query Language	Asks    questions to get data				SELECT
