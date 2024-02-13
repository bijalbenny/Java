import java.util.*;
import java.io.*;
public class Token {

	public static void main(String[] args)throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String item = sc.nextLine();
   FileWriter writer = new FileWriter("D:/file1.txt");
   StringTokenizer str = new StringTokenizer(item);
   while(str.hasMoreElements()) {
	   writer.write(str.nextToken());
	  writer.write("\n\t");
   }
   writer.flush();
   writer.close();
   
   
   char []data = new char[50];
   FileReader reader = new FileReader("D:/file1.txt");
   int bytesread=reader.read(data);
   System.out.println(new String(data,0,bytesread));
	}

}
