/*
 * Copyright 2015 Palash Kanti Kundu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package in.palash90.algorithms.sort;

/**
 * Common implementations for sorting goes here.
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 18, 2015
 */
public abstract class AbstractSort implements ISort {
	/**
	 * Method to print out all the elements of an integer array. Useful for
	 * development purposes.
	 * 
	 * @param arr
	 */
	public void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}

	/**
	 * Generic implementation for swapping elements in an array.
	 * 
	 * @param original
	 * @param i
	 * @param j
	 */
	protected void swap(int[] original, int i, int j) {
		int temp = original[j];
		original[j] = original[i];
		original[i] = temp;
	}
}
