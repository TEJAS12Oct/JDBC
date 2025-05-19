package ClassForName;

public class DemoClass {

	public static void main(String[] args) throws Exception {

		// First Way to execute Static And Instance Block
		// prepared p = new prepared();

		// Second Way to execute Static
		/*
		 * If you're using packages properly, you should fully qualify the class name.
		 * Since the prepared class is in the ClassForName package, the call should be:
		 * 
		 * 
		 */
		Class.forName("ClassForName.prepared");
		// Otherwise, it may throw ClassNotFoundException.

		// Third Way to execute Static And Instance Block
		Class.forName("ClassForName.prepared").newInstance();
	}

}

class prepared {
	static {
		System.out.println("Static Block");
	}

	// Instance Block
	{
		System.out.println("Instance Block");
	}
}
