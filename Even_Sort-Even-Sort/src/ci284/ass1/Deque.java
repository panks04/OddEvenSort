package ci284.ass1;

import java.util.ArrayList;

public class Deque{
	ArrayList<Integer> aDeque = new ArrayList<Integer>(); 
	public Deque(int max) {
		//
	}

	// insert an element at the front of the deque
	public void insertFront(int e) {
		aDeque.add(0, e);
	}

	// insert an element at the back of the deque
	public void insertBack(int e) {
		aDeque.add(aDeque.size(), e);
	}

	// remove the element at the front of the deque
	public int removeFront() {
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The deque is empty");
		}
		return aDeque.remove(0);
	}

	// remove the element at the back of the deque
	public int removeBack() {
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The deque is empty");
		}
		return aDeque.remove(aDeque.size()-1);

	}

	// return the element at the front of the deque without removing it
	public int peek() {
		int i = 0 ;
		return aDeque.get(i);

	}

	// returns the number of elements in the deque
	public int length() {
		int count = 0;
		for (int i = 0; i < aDeque.size(); i++) { // needs to go through the elements
			count++;
		}
		return count;

	}

	// returns true if the deque is full,
	// false otherwise
	public boolean isFull() {
		for (int i = 0; i < aDeque.size(); i++) {
			if(!aDeque.isEmpty()){
				return true;
			}
		}
		return false;

	}

}
