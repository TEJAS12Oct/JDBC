package CreateStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoClass4 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/db";
		String UName = "root";
		String Password = "Sajet@1299";
		String Query = "insert into student values(4 , 'Gourav')";

		String Name;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, UName, Password);

		Statement s = con.createStatement();
		int count = s.executeUpdate(Query); // DDL , DML ,DQL
		System.out.println(count + " : Rows Affectd");

		s.close();
		con.close();
	}

}

/*
 * DDL Data Definition Language Makes or changes tables CREATE, ALTER, DROP DML
 * Data Manipulation Language Adds, changes, and deletes data INSERT, UPDATE, DELETE
 * DQL Data Query Language Asks questions to get data SELECT
 */