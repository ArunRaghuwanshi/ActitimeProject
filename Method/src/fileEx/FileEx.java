package fileEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
public class FileEx {
  
	public static void main(String[] args) throws IOException {
		File ob=new File("C:\\Users\\Lenovo\\Desktop\\ApiTesting\\file.txt");
		PrintWriter p=new PrintWriter(ob);
		p.print("Hello this is an Example");
		p.print(100);
		p.println(123);
		p.close();
		FileReader fr=new FileReader(ob);
		BufferedReader bf=new BufferedReader(fr);
		System.out.println("Reading from file");
		String s=bf.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=bf.readLine();
		}
		bf.close();
		System.out.println("open and check your file");
		
		
	}
}
