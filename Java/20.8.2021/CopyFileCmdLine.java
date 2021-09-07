/* Write a main program that copies a given text file into another 
 * file using SimpleReader to read the input file and SimpleWriter to 
 * write the output file. The names of the input text file to be copied 
 * and of the destination file where the copy is to be saved are provided 
 * as command-line arguments. Assume that appropriate arguments will be 
 * provided and no error checking is necessary. The command-line arguments 
 * are accessible by your main program through the String[] args array 
 * parameter to the main method. */

package FileStreamEX;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCmdLine {
static String msg="";
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(args[0]);
			fw.write("Hi Hello I am mahalakshmi");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			FileReader fr = new FileReader(args[0]);
			int ch;
			while((ch=fr.read())!=-1) {
				msg=msg+(char)ch;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileWriter fw=null;
		try {
			 fw= new FileWriter(args[1]);
			fw.write(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("file copied successfully to destination file");
		}
			
}
}



