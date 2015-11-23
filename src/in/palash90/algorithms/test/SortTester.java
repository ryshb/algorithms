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

import in.palash90.algorithms.sort.ISort;
import in.palash90.algorithms.sort.SortFactory;
import in.palash90.algorithms.sort.SortType;
import in.palash90.algorithms.utils.ArrayUtils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
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
		int length = 50;
		int[] original = ArrayUtils.constructRandomArray(length);

		/*
		 * Perform the test for each known algorithm.
		 */
		performTest(SortType.MERGE, original);
		// performTest(SortType.INSERTION, original);
		// performTest(SortType.GNOME, original);
		// performTest(SortType.BOGO, original);
	}

	/**
	 * Perform the test on the array for specified sort type.
	 * 
	 * @param length
	 * @param sdf
	 */
	private static void performTest(SortType t, int[] original) {
		// Maintain the original copy. As it may be used for another test.
		int[] copy = Arrays.copyOf(original, original.length);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.SSS");
		Date d1 = new Date();

		ISort sort = SortFactory.createSort(t);
		System.out.println("Before sort:");

		sort.printArray(copy);

		System.out.println(t + " sort Started at: " + sdf.format(d1));
		sort.sort(copy);

		Date d2 = new Date();

		System.out.println(t + " sort Completed at: " + sdf.format(d2));

		System.out
				.printf("Time taken to sort %d element using %s Sort: %d miliseconds\n",
						copy.length, t.toString(),
						(d2.getTime() - d1.getTime()));

		System.out.println("After sort:");

		sort.printArray(copy);
		System.out.println();
	}
}
