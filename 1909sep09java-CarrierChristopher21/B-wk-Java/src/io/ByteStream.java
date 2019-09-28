package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStream {
	public static void main(String[] args) {
		String file = "byteFile.txt";
//		writeByteStream(file);
		ReadByteStream(file);
	}

	static void writeByteStream(String filename) {
		try(FileOutputStream outs = new FileOutputStream(filename)){
			outs.write(73);
			outs.write(43);
			outs.write(21);
			outs.write(59);
			outs.write(100);
			
			
		}catch (FileNotFoundException i) {
			i.printStackTrace();
		}catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	static void ReadByteStream(String filename) {
		try(InputStream inputs = new FileInputStream(filename)){
			int i;
			while((i=inputs.read())!=-1) {
				System.out.println(i+"");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
