import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class display {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt", true);
            writer.write("OOPS LAB\n");  
            writer.write("Done\n");
            writer.close();
            FileReader reader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 	    System.out.println("Data read from the file");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            System.out.println("Error Occurred!!!!!!!");
        }
 
    }
 
}