package utilityclasses;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) throws Exception{
		
		String folder = "C:\\Users\\Vaibhav\\git\\tm_automation_sep_23_we";
		
		File file1 = new File(folder);
		
//		System.out.println(file1.exists());
//		System.out.println(file1.getAbsolutePath());
//		System.out.println(file1.getFreeSpace());
//		System.out.println(new Date(file1.lastModified()));
		
		// folder / file
//		System.out.println(file1.isDirectory());
//		System.out.println(file1.isFile());
		
//		File[]  files = file1.listFiles();
//		for(int i = 0 ; i < files.length ; i++) {
//			File file = files[i];
//			System.out.println(file.getAbsolutePath() + " - " + (file.isDirectory() ? "Folder":"File"));
//		}
		
		// Flow -> Byte/ bits
		// Stream -> one side is always going on
		// Buffering ->  (Buffer object)
		
		File readingfile = new File(folder+"/readingfile.txt");
		FileInputStream inputstream = new FileInputStream(readingfile);
		BufferedInputStream br = new BufferedInputStream(inputstream);
		
		// -1 = EOF
		int ch = -1;
		while((ch = br.read()) != -1 ) { 
			System.out.print((char)ch);
		}
		br.close();
		inputstream.close();
		
	}
}
