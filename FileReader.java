import java.io.FileReader;
import java.io.IOException;
public class Fileread {

	public static void main(String[] args) {
		char[ ] data = new char[50];
try {
	FileReader reader = new FileReader("D:/inputnew.txt");
	int bytesRead = reader.read(data);

	System.out.println (new String(data,0,bytesRead));
    if(reader!=null)
	reader.close();
}catch(IOException e) {

}
	}

}
