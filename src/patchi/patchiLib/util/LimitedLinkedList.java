package patchi.patchiLib.util;

import java.util.Collection;
import java.util.LinkedList;

public class LimitedLinkedList<E> extends LinkedList<E> {

	private static final long serialVersionUID = 1L;
	
	private final int LIMIT;
	
	public LimitedLinkedList(int l) {
		this.LIMIT = l;
	}
	
	public LimitedLinkedList(Collection<E> data, int l) {
		this(l);
		
		for(E e : data) {
			this.add(e);
		}
		
	}
	
	@Override
	public boolean add(E e) {
		
		boolean a = super.add(e);
		
		while(a && super.size() > LIMIT) {
			super.remove();
		}
		
		return a;
		
	}
	
}
