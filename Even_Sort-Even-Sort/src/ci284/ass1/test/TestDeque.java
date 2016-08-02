package ci284.ass1.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import ci284.ass1.Deque;

public class TestDeque {
	
	@Test
	public void testFrontAndLength() {
		Deque d = new Deque(1);
		d.insertFront(1);
		assertEquals(1, d.length());
		int f = d.removeBack();
		assertEquals(1, f);
		
		int max = (new Random()).nextInt(99);
		d = new Deque(max);
		for(int i=0;i<max;i++) {
			d.insertFront(i);
		}
		assertEquals(max, d.length());
	}
	
	@Test
	public void testRemoveFrontThrows() {
		Deque d = new Deque(1);
		d.insertFront(1);
		d.removeFront();
		try {
			d.removeFront();
			fail("Removed from front of an empty Deque but didn't fail");
		} catch (RuntimeException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testRemoveBackThrows() {
		Deque d = new Deque(1);
		d.insertFront(1);
		d.removeBack();
		try {
			d.removeBack();
			fail("Removed from front of an empty Deque but didn't fail");
		} catch (RuntimeException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testBackAndLength() {
		Deque d = new Deque(1);
		d.insertBack(1);
		assertEquals(1, d.length());
		int b = d.removeBack();
		assertEquals(1, b);
		
		int max = (new Random()).nextInt(99);
		d = new Deque(max);
		for(int i=0;i<max;i++) {
			d.insertBack(i);
		}
		assertEquals(max, d.length());
	}
	
	@Test
	public void testIsFull() {
		Deque d = new Deque(1);
		d.insertFront(1);
		assertTrue(d.isFull());
		
		d.removeFront();
		assertFalse(d.isFull());
		
		d = new Deque(10);
		for(int i=0;i<10;i++) {
			d.insertFront(i);
		}
		assertTrue(d.isFull());
	}
	
	@Test
	public void testPeek() {
		Deque d = new Deque(10);
		d.insertFront(1);
		assertEquals(1, d.peek());
		assertEquals(1, d.length());
		d.removeFront();
		try {
			d.peek();
			fail("Peeked into an empty Deque but didn't fail");
		} catch (RuntimeException e){
			assertTrue(true);
		}
	}
}
