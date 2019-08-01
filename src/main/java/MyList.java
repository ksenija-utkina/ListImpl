import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List {

	public int size() {
		return 0;
	}

	public boolean isEmpty() {
		return false;
	}

	public boolean contains(Object o) {
		return false;
	}

	public Iterator iterator() {
		throw new UnsupportedOperationException("no need to implement this method");
	}

	public Object[] toArray() {
		return new Object[0];
	}

	public boolean add(Object o) {
		return false;
	}

	public boolean remove(Object o) {
		return false;
	}

	public boolean addAll(Collection c) {
		return false;
	}

	public boolean addAll(int index, Collection c) {
		return false;
	}

	public void clear() {

	}

	public Object get(int index) {
		return null;
	}

	public Object set(int index, Object element) {
		return null;
	}

	public void add(int index, Object element) {

	}

	public Object remove(int index) {
		return null;
	}

	public int indexOf(Object o) {
		return 0;
	}

	public int lastIndexOf(Object o) {
		return 0;
	}

	public ListIterator listIterator() {
		throw new UnsupportedOperationException("no need to implement this method");
	}

	public ListIterator listIterator(int index) {
		throw new UnsupportedOperationException("no need to implement this method");
	}

	public List subList(int fromIndex, int toIndex) {
		return null;
	}

	public boolean retainAll(Collection c) {
		return false;
	}

	public boolean removeAll(Collection c) {
		return false;
	}

	public boolean containsAll(Collection c) {
		return false;
	}

	public Object[] toArray(Object[] a) {
		return new Object[0];
	}

}
