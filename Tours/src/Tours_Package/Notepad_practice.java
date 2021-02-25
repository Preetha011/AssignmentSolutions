package Tours_Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Notepad_practice {

	public static void main(String[] args) throws IOException  {
		
		String file_path = "C:\\Users\\intellipaat-chat\\Desktop\\Java Programs\\textpractice.txt";
		

		BufferedReader a = new BufferedReader(new FileReader(file_path));
		
		String startLine;
		
		while((startLine = a.readLine()) != null) {
			
			
			System.out.println(startLine);
		}
		
		a.close();

	}
	

}
