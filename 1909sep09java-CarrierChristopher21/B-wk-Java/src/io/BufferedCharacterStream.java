package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharacterStream {

	public static void main(String[] args) {
	String file = "bufferedChars.txt";
//	writeCharStream(file);
	readCharacterStream(file);
	
		
	}
	
	static void writeCharStream(String filename) {
		try(BufferedWriter writer = new BufferedWriter(
				new FileWriter(filename,true))){
			writer.write("Hello World\n");
			writer.write("popcorn\n");
			writer.write("for pirates");
			writer.write("aaaarrrrgh\n");
			writer.write("Buffered Streams are faster and easier to use\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void readCharacterStream(String filename) {
		try(BufferedReader reader = new BufferedReader(
				new FileReader(filename))){
			String line="";
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
