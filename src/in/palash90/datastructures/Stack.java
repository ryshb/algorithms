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

import java.util.EmptyStackException;

/**
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 23, 2015
 */
public class Stack<T> {
	private Node<T> node = null;
	private int length = 0;

	/**
	 * Push a new data on the stack.
	 * 
	 * @param data
	 */
	public void push(T data) {
		Node<T> node = new Node<T>();
		node.setData(data);
		length++;

		if (null == this.node) {
			this.node = node;
		} else {
			node.setNextNode(this.node);
			this.node = node;
		}
	}

	/**
	 * Returns the data on the top.
	 * 
	 * @return
	 */
	public T pop() {
		return peek(true);
	}

	/**
	 * Returns the data on the top.
	 * 
	 * @return
	 */
	public T peek() {
		return peek(false);
	}

	/**
	 * Returns true if the stack is empty.
	 * 
	 * @return
	 */
	public boolean empty() {
		return this.node == null;
	}

	/**
	 * Search for an object in the stack. Uses equals() method to determine the
	 * equality of two objects.
	 * 
	 * @param obj
	 * @return
	 */
	public int search(T obj) {
		if (this.node == null) {
			throw new EmptyStackException();
		} else if (obj == null) {
			Node<T> node = this.node;
			int i = 0;
			while (node != null) {
				if (node.getData() == null) {
					return (length - i);
				} else {
					i++;
					node = node.getNextNode();
				}
			}
		} else {
			Node<T> node = this.node;
			int i = 0;
			while (node != null) {
				if (node.getData().equals(obj)) {
					return (length - i);
				} else {
					i++;
					node = node.getNextNode();
				}
			}
		}
		return -1;
	}

	/**
	 * Actual peek with configuration to either work as pop or peek.
	 * 
	 * @return
	 */
	private T peek(boolean pop) {
		if (null == this.node) {
			throw new EmptyStackException();
		} else {
			T data = this.node.getData();
			if (pop) {
				this.node = this.node.getNextNode();
				length--;
			}
			return data;
		}
	}

	/**
	 * Returns the size of the stack.
	 * 
	 * @return the length
	 */
	public int size() {
		return length;
	}
}
