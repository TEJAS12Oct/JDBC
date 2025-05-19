package JDBCDoa1;

public class JDBCDoa {

	public static void main(String[] args) throws Exception {

		StudentDoa Doa = new StudentDoa();
		Student s1 = Doa.getStudent(3);
		System.out.println(s1.Sname);
	}

}
