package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) {
		String file = "charFile.txt";
//		writeCharacterStream(file);
		readCharStream(file);
		
	}
	
	
	static void writeCharacterStream(String filename) {
		try(FileWriter writer = new FileWriter(filename)){
			for(int i =60;i<72;i++) {
				writer.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void readCharStream(String filename) {
		try(FileReader reader = new FileReader(filename)){
			int i;
			while((i=reader.read())!=-1) {
				System.out.println((char)i+"");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
