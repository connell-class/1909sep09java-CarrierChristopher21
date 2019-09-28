package com.arc.data;

import java.util.List;

public interface DataAccessor {
	Object readObject(String filename);
	Object readObjectList(String filename);
	void writeObject(String filename, Object o);
	void writeObjectList(String filename, List<Object> l);
}
