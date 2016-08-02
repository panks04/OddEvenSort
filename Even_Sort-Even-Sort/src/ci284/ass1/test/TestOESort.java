package ci284.ass1.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import ci284.ass1.OddEvenSort;

public class TestOESort {

	int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] unsorted = {3, 5, 2, 9, 8, 1, 7, 6, 4};
	OddEvenSort oe;
	
	@Before
	public void setUp() throws Exception {
		oe = new OddEvenSort();
	}
	
	@Test
	public void testOddEvenSort() {
		int[] result = oe.sort(unsorted);
		debug(result);
		assertArrayEquals(result, sorted);
		Random gen = new Random();
		int[] randoms = new int[1000];
		for(int i=0;i<randoms.length;i++) {
			randoms[i] = gen.nextInt();
		}
		randoms = oe.sort(randoms);
		debug(randoms);
		for(int i=0;i<randoms.length-1;i++) {
			assertTrue(randoms[i] <= randoms[i+1]);
		}
	}
	
	private void debug(int[] arr) {
		System.out.print("{");
		for(Integer i: arr) {
			System.out.print(i+",");
		}
		System.out.println("}");
	}

}
