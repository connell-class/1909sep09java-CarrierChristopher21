package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample {
	
	public static void main(String[] args) {
		String file = "./ObjectFile.txt";
		
		Person p = new Person("Scott",356, 452769911);
		Person p1 = new Person("josie", 26, 123456789);
		Person p2 = new Person("bajaja", 28, 456789876);
		List<Person> l = new ArrayList<>();
		l.add(p);
		l.add(p1);
		l.add(p2);
		
//		writeObject(file, p);
//		readObject(file);
//		Person p1 =(Person)o;
//		System.out.println(p1.getName());
//		System.out.println(p1.getSsn());
		
		writeObjectList(file, l);
		readObjectList(file);
	}

	
	static Object readObject(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(filename))){
			Object obj = ois.readObject();
			System.out.println(obj);
			return obj;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	static void writeObject(String filename, Object o) {
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(filename))){
			
			oos.writeObject(o);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	static Object readObjectList(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(filename))){
			List<Person> obj = (List<Person>)ois.readObject();
			System.out.println(obj);
			return obj;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	static void writeObjectList(String filename, List<Person> o) {
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(filename))){
			
			oos.writeObject(o);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
