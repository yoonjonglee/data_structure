/**
 * 
 */
package practice2.fileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jinhyang
 *
 */
public class BinaryReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "file.dat";
		try {
			FileOutputStream out = new FileOutputStream(fileName);
			FileInputStream file = new FileInputStream(fileName);
			InputStreamReader in = new InputStreamReader(file);
			
			for(byte i=1; i<= 10; i++) {
				out.write(i);
			}
			int c;
			while((c = in.read())!= -1) {
				System.out.println(c + " ");
			}
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
