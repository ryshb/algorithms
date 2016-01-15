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

package in.palash90.algorithms.utils;

import java.util.Random;

/**
 * Utility class for different array related functionalities.
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 19, 2015
 */
public class ArrayUtils {
	/**
	 * Utility method to fill out the array with random integer elements.
	 * 
	 * @param length
	 * @param insertionOriginal
	 */
	public static int[] constructRandomArray(int length) {
		int[] numberArray = new int[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			numberArray[i] = (int) (random.nextInt(length) * Math.pow(-1,
					random.nextInt()));
		}
		return numberArray;
	}

	/**
	 * Utility method to fill out the array with ascending numbers.
	 * 
	 * @param length
	 * @param insertionOriginal
	 */
	public static int[] constructAscendingArray(int length) {
		int[] numberArray = new int[length];
		for (int i = 0; i < length; i++) {
			numberArray[i] = i;
		}
		return numberArray;
	}

	/**
	 * Utility method to fill out the array with descending numbers.
	 * 
	 * @param length
	 * @param insertionOriginal
	 */
	public static int[] constructDescendingArray(int length) {
		int[] numberArray = new int[length];
		for (int i = 0; i < length; i++) {
			numberArray[i] = length - i;
		}
		return numberArray;
	}

	/**
	 * Utility method to fill out the array with duplicate numbers.
	 * 
	 * @param length
	 * @param insertionOriginal
	 */
	public static int[] constructDuplicateArray(int length) {
		int[] numberArray = new int[length];
		for (int i = 0; i < length / 2; i++) {
			numberArray[i] = length - i;
			numberArray[length - i - 1] = length - i;
		}
		shuffleArray(numberArray);
		return numberArray;
	}

	static void shuffleArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}
}
