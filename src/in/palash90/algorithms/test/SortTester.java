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

package in.palash90.algorithms.test;

import in.palash90.algorithms.sort.InsertionSort;
import in.palash90.algorithms.sort.MergeSort;

import java.util.Date;

/**
 * Test the merge sort implementation.
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 18, 2015
 */
@Deprecated
public class SortTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int length = 999999;
		int[] original = new int[length];

		for (int i = 0; i < length; i++) {
			// original[i] = (int) (length * Math.random());
			original[i] = length - i;
		}
		MergeSort mergeSort = new MergeSort();
		Date d1 = new Date();
		mergeSort.sort(original);
		Date d2 = new Date();
		System.out
				.printf("Time taken to sort %d element using Merge Sort: %d miliseconds\n",
						length, (d2.getTime() - d1.getTime()));

		InsertionSort insertionSort = new InsertionSort();
		d1 = new Date();
		insertionSort.sort(original);
		d2 = new Date();
		System.out
				.printf("Time taken to sort %d element using Insertion Sort: %d miliseconds",
						length, (d2.getTime() - d1.getTime()));
	}

}
