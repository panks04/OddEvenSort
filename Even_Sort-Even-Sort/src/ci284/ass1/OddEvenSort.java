/* Include comments at the top of your source file that describe the complexity
 * of your solution, comparing it to BubbleSort, and then the complexity
 * of a hypothetical implementation where the odd and even sorts take place
 * in parallel on two processors with shared memory. You are not expected
 * to provide a formal proof but you should explain your reasoning as 
 * clearly as possible.
 * 
 * Odd even sort functions by comparing all the odd/even sort pairs of
 * adjacent elements in the list and if a pair is in the wrong order
 * (i.e. first one is bigger than the second),then the elements are switched.
 * It repeats this step until the list is sorted. Comparison to the bubble sort,
 * the odd even sort function is very similar as bubble sort functions by comparing
 * each pair of adjacent elements and are swapped if not in order.
 * 
 * Time complexity describes how much time an algorithm consumes based on the
 * length of the input, therefore no matter the size of the input it always
 * takes a constant time, whereas space complexity only uses a fixed amount of
 * space and it does not depend on the input, therefore it will take same amount
 * of space for every size of the input. Hence it's possible an algorithm may
 * have different time and space complexity, as they are not dependent to each other.
 * 
 * In a parallel computer the processors are closely connected and all processors share
 * the same memory and communicate by accessing this shared memory. Shared memory access
 * allows programs to access the same memory address simultaneously. These are done via
 * three approaches: Concurrent Read; Concurrent Write, Concurrent Read; Exclusive Write
 * and Exclusive Read; Exclusive Write.
 * 
 */

package ci284.ass1;

public class OddEvenSort {

	public int[] sort(int[] unsorted) {
		   boolean sorted = false;
		     while (!sorted) {
		          sorted = true;
		          for (int p = 1; p < unsorted.length - 1; p += 2) {
		               if (unsorted[ p ] > unsorted[ p + 1 ]) {
		                    swap( unsorted , p , p + 1 );
		                    sorted = false;
		               }
		          }
		          for (int i = 0; i < unsorted.length - 1; i += 2) {
		               if (unsorted[ i ] > unsorted[ i + 1 ]) {
		                    swap( unsorted , i , i + 1 );
		                    sorted = false;
		               }
		          }
		     }
			return unsorted;
	}

	private void swap(int[] unsorted, int i, int j) {
		int temp;
	     temp = unsorted[ i ];
	     unsorted[ i ] = unsorted[ j ];
	     unsorted[ j ] = temp;
		
	} 

}
