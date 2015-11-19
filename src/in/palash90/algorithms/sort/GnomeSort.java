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
 * The Gnome Sort implementation. Details can be found in
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 19, 2015
 */
public class GnomeSort extends AbstractSort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.palash90.algorithms.sort.ISort#sort(int[])
	 */
	@Override
	public void sort(int[] original) {
		int length = original.length;
		int i = 0;
		while (i < length) {
			if (i == 0 || original[i] >= original[i - 1]) {
				i++;
			} else {
				int temp = original[i];
				original[i] = original[i - 1];
				original[i - 1] = temp;
				if (i > 1) {
					i--;
				}
			}
		}
	}
}
