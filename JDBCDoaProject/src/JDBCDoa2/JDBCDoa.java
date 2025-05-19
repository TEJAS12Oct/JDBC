package JDBCDoa2;

public class JDBCDoa {

	public static void main(String[] args) throws Exception {
		StudentDoa Doa = new StudentDoa();
		Student S1 = new Student();
		S1.SID = 4;
		S1.SName = "Raj";

		Doa.addStudent(S1);

	}

}
