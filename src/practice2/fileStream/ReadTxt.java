/**
 * 
 */
package practice2.fileStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jinhyang
 *
 */
public class ReadTxt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader in = new FileReader("file1.txt");
			int c;
			String s = new String();
			while((c = in.read())!= -1) {
				s = s + (char)c;
			}
			System.out.println(s);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no file exist");
		} catch (Exception e) {
			System.out.println("file is not configured");
		}

	}

}
