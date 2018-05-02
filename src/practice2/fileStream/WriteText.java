/**
 * 
 */
package practice2.fileStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author jinhyang
 *
 */
public class WriteText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//FileWriter out = new FileWriter("file2.txt");
			BufferedWriter out = new BufferedWriter(new FileWriter("file2.txt"));
			out.write("Hello man\n");
			out.newLine();
			out.write("Hello boy\n");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
