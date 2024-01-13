package exceptional_handling;

import java.io.File;
import java.io.FileReader;

public class Test1 {
	public static void main(String[] args) {
		File f1 = new File("C://");
		try {
			FileReader fr = new FileReader(f1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
