import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;



public class DefaultXMLTest {
	
	@Before
	public void alignmentTestSetup() {
		
		final String dir = System.getProperty("user.dir");
		String[] comLineArgs = {"-c" + dir + "\\src\\main\\resources\\CheckstyleFormat.xml" , "-o" + dir + "\\src\\main\\resources\\CheckstyleOutput.txt ", dir + "\\src\\test\\resources\\IndentationTestCase1.java"};
		
		StaticAnalyser.main(comLineArgs);
	}
	
	@Test
	public void alignmentTest() throws IOException {
		boolean found = false;
		final String dir = System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new FileReader(dir + "\\src\\main\\resources\\CheckstyleOutput.txt"));
		String line;
		while((line = br.readLine()) != null){
			if(line.contains("indentation")) {
				System.out.println(line);
				found = true;
			}
		}
		br.close();
		
		assertEquals("indentation error should be found",true,found);
	}
}

