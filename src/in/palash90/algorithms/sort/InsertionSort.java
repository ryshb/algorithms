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
 * Insertion sort implementation.
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 18, 2015
 */
public class InsertionSort extends AbstractSort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.palash90.algorithms.sort.ISort#sort(int[])
	 */
	@Override
	public int[] sort(int[] original) {
		for (int i = 1; i < original.length; i++) {
			int valueToSort = original[i];
			int j = i;
			while (j > 0 && original[j - 1] > valueToSort) {
				original[j] = original[j - 1];
				j--;
			}
			original[j] = valueToSort;
			System.out.println("Completed " + i);
		}
		return original;
	}

}
