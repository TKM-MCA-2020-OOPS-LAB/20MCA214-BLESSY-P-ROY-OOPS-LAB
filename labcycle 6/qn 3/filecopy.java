import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class filecopy{
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("C:\\Users\\bibin\\eclipse-workspace\\co6\\src\\orginal.txt");
			BufferedReader br = new BufferedReader(fr);
                        
			FileWriter fw = new FileWriter("C:\\Users\\bibin\\eclipse-workspace\\co6\\src\\copy.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s+"\n"); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                                                 System.out.println("file copied");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
