package Q1;

import java.util.Arrays;

public class ArrayWithMemory<E> implements ReadWriteCount<E> {
	
	int reads, writes;
	int size;
	E[] array;
	
	@SuppressWarnings("unchecked")
	public ArrayWithMemory(int size) {
		this.size = size;
		array = (E[]) new Object[size];
		reads = 0;
		writes = 0;
	}
	
	public void write(int i, E e) {
		array[i] = e;
		writes++;
	}

	public E read(int i) {
		reads++;
		return array[i];
	}

	public int numberOfWrites() {
		return writes;
	}

	public int numberOfReads() {
		return reads;
	}

	public void resetMemory() {
		reads = 0;
		writes = 0;
	}

	public void printOutContent() {
		System.out.println(Arrays.deepToString(array));
	}

}
