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
 * Insertion sort implementation. Details can be found here.
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 18, 2015
 */
public class QuickSort extends AbstractSort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.palash90.algorithms.sort.ISort#sort(int[])
	 */
	@Override
	public void sort(int[] original) {
		sort(original, 0, original.length - 1);
	}

	/**
	 * Overloaded version of recursive method.
	 * 
	 * @param original
	 * @param low
	 * @param high
	 */
	private void sort(int[] original, int low, int high) {
		if (low < high) {
			int partition = partition(original, low, high);
			sort(original, low, partition - 1);
			sort(original, partition + 1, high);
		}
	}

	/**
	 * This implementation chooses the last element of the array as the pivot.
	 * 
	 * @param original
	 * @param low
	 * @param high
	 * @return
	 */
	private int partition(int[] original, int low, int high) {
		int pivot = original[high];
		int pIndex = low;

		for (int i = low; i < high; i++) {
			if (original[i] <= pivot) {
				swap(original, i, pIndex);
				pIndex++;
			}
		}
		swap(original, pIndex, high);
		return pIndex;
	}
}
