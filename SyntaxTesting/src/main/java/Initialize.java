import com.puppycrawl.tools.checkstyle.Main;

public class Initialize {

	public static void main(String[] args) {
		final String dir = System.getProperty("user.dir");
		String[] comLineArgs = {"-c" + dir + "\\src\\main\\resources\\CheckstyleFormat.xml" , "-o" + dir + "\\src\\main\\resources\\CheckstyleOutput.txt ", dir + "\\src\\main\\java\\Test.java"};

		Main.main(comLineArgs);
		//Hello World!
	}
}

