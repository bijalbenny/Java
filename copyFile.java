import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CopyFile {

	public static void main(String[] args) throws IOException {
		char [] data = new char[21];
		try {
			FileReader reader = new FileReader("D:/output.txt");
			int bytesRead = reader.read(data);
			System.out.println(data);
			reader.close();
			FileWriter writer = new FileWriter("D:/newoutput.txt");
			writer.write(data,0,bytesRead);
			writer.flush();
			writer.close();
			
		}catch(FileNotFoundException e) {
			e.getStackTrace();
		}

	}

}
