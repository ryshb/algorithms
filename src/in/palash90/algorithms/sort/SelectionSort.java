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
 * Selection Sort, one of the simplest sorting algorithms.
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 25, 2015
 */
public class SelectionSort extends AbstractSort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.palash90.algorithms.sort.ISort#sort(int[])
	 */
	@Override
	public void sort(int[] original) {
		int i, j;
		int iMin;
		for (j = 0; j < original.length - 1; j++) {
			iMin = j;
			for (i = j + 1; i < original.length; i++) {
				if (original[i] < original[iMin]) {
					iMin = i;
				}
			}

			if (iMin != j) {
				swap(original, j, iMin);
			}
		}
	}
}
