package bufferedreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleEncryption {
	void encrypt(String source, String dest, int shiftsize) 
	{
		BufferedReader reader;
		BufferedWriter writer;
		
		try {
			reader = new BufferedReader(new FileReader(source));
			writer = new BufferedWriter(new FileWriter(dest));
			String line = reader.readLine();
			int data;
			while(line!=null)
			{
				for(int i = 0;i<line.length();i++)
				{
					data = (int) line.charAt(i) + shiftsize;
					writer.write(data);
					
				}
				writer.write((int)'\n');
				line = reader.readLine();
				}
			reader.close();
			writer.close();
			} catch (IOException ie) {
			// TODO Auto-generated catch block
			System.out.println("Failed encrypting the file contetnt");
		}
		
		
		
	}
	
	public void viewFileContent(String fileName)
	{
		BufferedReader reader;
		try
		{
		reader = new BufferedReader(new FileReader(fileName));
		String line = reader.readLine();
		while(line !=null)
		{
			System.out.println(line);
			line = reader.readLine(); 
		}
		reader.close();
	}catch(IOException ie)
		{
		System.out.println("Failed to open file for reading");
		}
	}

}

