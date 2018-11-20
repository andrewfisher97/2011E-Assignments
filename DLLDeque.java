package Q2;

public class DLLDeque<E> implements Deque<E> {
	
	private DLLNode<E> header;
	private DLLNode<E> trailer;
	private int size;
	
	public DLLDeque() {
		header = new DLLNode<>(null, null, null);
		trailer = new DLLNode<>(null, null, null);
		size = 0;
		header.setNext(trailer);
		trailer.setPrev(header);
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return size;
	}

	public void addFirst(E item) {
		DLLNode<E> second = header.getNext();
		DLLNode<E> newFirst = new DLLNode<>(item, second, header);
		second.setPrev(newFirst);
		header.setNext(newFirst);
		size++;
	}

	public void addLast(E item) {
		DLLNode<E> secondLast = trailer.getPrev();
		DLLNode<E> newLast = new DLLNode<>(item, trailer, secondLast);
		secondLast.setNext(newLast);
		trailer.setPrev(secondLast);
		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;
		DLLNode<E> remove = header.getNext();
		header.setNext(remove.getNext());
		remove.getNext().setPrev(header);
		size--;
		return remove.getElement();
	}

	public E removeLast() {
		if (isEmpty())
			return null;
		DLLNode<E> remove = trailer.getPrev();
		trailer.setPrev(remove.getPrev());
		remove.getPrev().setNext(trailer);
		size--;
		return remove.getElement();
	}

	public E first() {
		if (isEmpty())
			return null;
		return header.getNext().getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		return trailer.getPrev().getElement();
	}

	public void printOutContent() {
		DLLNode<E> pointer = header.getNext();
		for (int i = 0; i < size; i++) {
			System.out.println(pointer.getElement());
			pointer = pointer.getNext();
		}
	}
	
}
