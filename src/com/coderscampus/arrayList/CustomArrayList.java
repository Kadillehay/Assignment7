package com.coderscampus.arrayList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	int counter = 0;
	int size = 0;

	@Override
	public boolean add(T item) {
		if (counter == items.length) {
			items = Arrays.copyOf(items, items.length * 2);

		}

		items[counter] = item;
		counter++;

		return true;
	}

	@Override
	public int getSize() {

		int count = 0;

		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				count++;
//				size++;
			}
		}
		return count++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException{
		if (index < 0 || index > counter) {
			throw new IndexOutOfBoundsException();
		}
		return (T) items[index];
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items);
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > counter) {
			throw new IndexOutOfBoundsException();
		}

		if (counter == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
			
		}

		// shift all elements to the right of the index by 1
		for (int i = counter - 1; i >= index; i--) {
			items[i + 1] = items[i];
		}

		items[index] = item;
		counter++;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
	    if (index < 0 || index >= getSize()) {
	        throw new IndexOutOfBoundsException();
	    }
	    T item = get(index);
	    for (int i = index; i < getSize() - 1; i++) {
	        items[i] = items[i + 1];
	    }
	    items[--counter] = null;
	    return item;
	}


}
