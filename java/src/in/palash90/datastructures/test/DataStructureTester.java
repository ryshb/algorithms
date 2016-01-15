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

package in.palash90.datastructures.test;

import in.palash90.datastructures.Node;
import in.palash90.datastructures.Stack;

/**
 * @author Palash Kanti Kundu
 * @version 1.0
 * @since Nov 23, 2015
 */
@Deprecated
public class DataStructureTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Number> node1 = new Node<Number>();
		node1.setData(5);
		Node<Number> node2 = new Node<Number>();
		node2.setData(6);
		Node<Number> node3 = new Node<Number>();
		node3.setData(7);

		Stack<Node<Number>> s = new Stack<Node<Number>>();
		System.out.println("Stack Size before push: " + s.size());
		s.push(node1);
		System.out.println("Stack Size after first push: " + s.size());
		s.push(node2);
		System.out.println("Stack Size after second push: " + s.size());
		s.push(node3);
		System.out.println("Stack Size after third push: " + s.size());

		System.out.println("Node 3 is at position: " + s.search(node3));

		System.out.println("Pop one element: " + s.pop());
		System.out.println("Stack Size after after first pop: " + s.size());

		System.out.println("Node 3 is at: " + s.search(node3));

		System.out.println("Peek one element: " + s.peek());
		System.out.println("Stack Size after after first peek: " + s.size());

		System.out.println("Popping second element: " + s.pop());
		System.out.println("Stack Size after second pop: " + s.size());

		System.out.println("Node1 is at: " + s.search(node1));

		System.out.println("Popping third element: " + s.pop());
		System.out.println("Stack Size after third pop: " + s.size());

		System.out.println("Pop one element: " + s.pop());
	}
}
