package Q2;

public class DLLNode<E> {
	
	private E element;
	private DLLNode<E> next, prev;
	
	public DLLNode(E element, DLLNode<E> next, DLLNode<E> prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}
	
	public E getElement() {
		return element;
	}
	
	public DLLNode<E> getNext() {
		return next;
	}
	
	public DLLNode<E> getPrev() {
		return prev;
	}
	
	public void setElement(E element) {
		this.element = element;
	}
	
	public void setNext(DLLNode<E> next) {
		this.next = next;
	}
	
	public void setPrev(DLLNode<E> prev) {
		this.prev = prev;
	}
}
