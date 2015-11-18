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

import java.util.Arrays;

/**
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 18, 2015
 */
public class MergeSort extends AbstractSort {
	private int[] array;
	private int[] tempMergArr;
	private int length;

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.palash90.algorithms.sort.ISort#sort(int[])
	 */
	@Override
	public int[] sort(int[] original) {
		this.array = Arrays.copyOf(original, original.length);
		this.length = original.length;
		this.tempMergArr = new int[length];
		return mergeSort(0, length - 1);
	}

	private int[] mergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			mergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			mergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
		return array;
	}

	/**
	 * 
	 */
	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}
}
