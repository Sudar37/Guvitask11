package task11;

import java.io.*; 

public class Que8 {

	public static void main(String[] args) {

		FileReader reader = new FileReader("file.txt"); 

		// passing FileReader to 
		// buffered reader 
		BufferedReader br = new BufferedReader(reader); 
  
		// declaring empty string  
		String data =null; 
  
		// while loop to read data  
		 
		try {
			while ((data = br.readLine()) != null)  
			{ 
				System.out.println(data); 
			}
		} catch (IOException e) {
	
			e.printStackTrace();
		} 
  
	}
}
