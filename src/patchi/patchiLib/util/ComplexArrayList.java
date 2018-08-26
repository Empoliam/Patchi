package patchi.patchiLib.util;

import java.util.ArrayList;

/**
 * An encapsulation of <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a> designed for easier retrieval of objects with a common parent.
 *
 * @param <S> Superclass of all stored objects
 */
public class ComplexArrayList<S> {
	
	/** Encapsulated list. */
	private ArrayList<S> list;
	
	/**
	 * Instantiation of new complex list
	 */
	public ComplexArrayList() {
		list = new ArrayList<S>();
	}
	
	/**
	 * Adds an object to the list
	 *
	 * @param in object to add
	 */
	public void add(S in) {
		list.add(in);
	}
	
	/**
	 * Returns the object stored at the given index as it's superclass
	 *
	 * @param index index of requested item
	 * @return requested item as type S
	 */
	public S get(int index) {
		return list.get(index);
	}
	
	/**
	 * Returns the object at the given index, and automatically casts to the requested type
	 *
	 * @param <T> Type of object to be returned
	 * @param index index of requested item
	 * @param t class of object to be returned
	 * @return requested item as type T
	 */
	public <T extends S> T get(int index, Class<T> t) {
		return t.cast(get(index));
	}

	/**
	 * Returns all objects of the requested type as an ArrayList
	 *
	 * @param <T> type of objects to be returned
	 * @param t class of objects to be returned
	 * @return ArrayList of requested objects
	 */
	public <T extends S> ArrayList<T> getSpecificObjects(Class<T> t) {
		
		ArrayList<T> sublist = new ArrayList<T>();
		
		for(S s : list) {
			if (t.isAssignableFrom(s.getClass())) sublist.add(t.cast(s));
		}
		
		return sublist;
		
	}
	
}
