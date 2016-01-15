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

import java.util.Random;

/**
 * The ineffective algorithm of sorting based on generate and test paradigm.
 * More details can be found here
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 19, 2015
 */
public class BogoSort extends AbstractSort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.palash90.algorithms.sort.ISort#sort(int[])
	 */
	@Override
	public void sort(int[] original) {
		while (!isSorted(original)) {
			shuffle(original);
		}
	}

	/**
	 * Shuffle the array in random swap.
	 * 
	 * @param original
	 */
	private void shuffle(int[] original) {
		Random random = new Random();
		for (int i = 0; i < original.length; i++) {
			int temp;
			int swapIndex = random.nextInt(original.length);
			temp = original[i];
			original[i] = original[swapIndex];
			original[swapIndex] = temp;
		}
	}

	/**
	 * Checks if the array is sorted or not.
	 * 
	 * @param original
	 * @return
	 */
	private boolean isSorted(int[] original) {
		for (int i = 0; i < (original.length - 1); i++) {
			if (original[i] > original[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
