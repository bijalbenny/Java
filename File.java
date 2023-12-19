import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileHandling {
	public static void main(String[] args) throws IOException {
		String data = "this is my first file";
		FileWriter writer = new FileWriter("D:/output.txt");
		writer.write(data);
		writer.flush();
		writer.close();
		try {
		char [] item = new char[230];
		FileReader reader = new FileReader("D:/output.txt");
		int bytesread = reader.read(item);
		System.out.println(data);
		if(reader!=null) {
			reader.close();
		}}catch(FileNotFoundException e) {
			e.getStackTrace();
		}
	}
}


