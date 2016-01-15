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

package in.palash90.datastructures;


/**
 * Basic unit of Linked Data Structures.
 * 
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 23, 2015
 */
public class Node<T> {
	private T data;
	private Node<T> nextNode;

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param t
	 *            the t to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the nextNode
	 */
	public Node<T> getNextNode() {
		return nextNode;
	}

	/**
	 * @param nextNode
	 *            the nextNode to set
	 */
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
}
