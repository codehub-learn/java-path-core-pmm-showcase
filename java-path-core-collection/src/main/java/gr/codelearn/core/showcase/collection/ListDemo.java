package gr.codelearn.core.showcase.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	private static final Logger logger = LoggerFactory.getLogger(ListDemo.class);

	public static void createLists() {
		logger.info("### LIST CREATE ACTIONS ###");

		// Creating a default list
		List<String> list = Arrays.asList("Lars", "Simon");
		list.set(0, "Johnny");

		// Alternatively, using directly the dafault implementation
		List<String> anotherList = new ArrayList<>();
		anotherList.add("Lars");
		anotherList.add("Simon");
		anotherList.set(0, "Johnny");

		// print each element to the console using method references
		list.forEach(logger::info);
		anotherList.forEach(logger::info);

		// Create an unmodifiable lists
		List<String> listCopy1 = List.copyOf(anotherList);
		List<String> listCopy2 = List.of("copy1", "copy2");
		// listCopy1.add("If uncommented, this action will generate exception");
		// listCopy2.add("If uncommented, this action will generate exception");

		// Use type inference for ArrayList
		List<Integer> intList = Arrays.asList(3, 2, 1, 4, 5, 6, 6);

		// alternative you can declare the list via:
		// List<Integer> list = new ArrayList<>();
		// and use list.add(element); to add elements
		for (Integer integer : intList) {
			logger.info("{}", integer);
		}
	}

	public static void otherListActions() {
		logger.info("");
		logger.info("### LIST OTHER ACTIONS ###");

		// Sorting Lists
		logger.info("Sorting with natural order");
		List<String> l1 = createList();
		l1.sort(null);
		l1.forEach(logger::info);
		logger.info("");

		logger.info("Sorting with a lambda expression for the comparison");
		List<String> l2 = createList();
		l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));  // sort ignoring case
		l2.forEach(logger::info);
		logger.info("");

		logger.info("Sorting with a method references");
		List<String> l3 = createList();
		l3.sort(String::compareToIgnoreCase);
		l3.forEach(logger::info);
		logger.info("");

		// Demonstrate removal
		List<String> l4 = createList2();
		logger.info("Demonstration of removeIf");
		// Remove all items which contains an "x"
		l4.removeIf(s -> s.toLowerCase().contains("x"));
		l4.forEach(logger::info);
		logger.info("");
		logger.info("Attempt to remove a non-existent item is {}.", l4.remove("non existent item"));
		logger.info("");

		l4.remove(1);
		l4.forEach(logger::info);
	}

	public static void conventionListActions() {
		logger.info("");
		logger.info("### LIST OTHER ACTIONS ###");

		// Convention from list to array
		List<String> list = createList2();
		Collections.sort(list);

		String[] arrayList = new String[list.size()];
		list.toArray(arrayList);

		logger.info("{}.", list);
		for (String arrayItem : arrayList) {
			logger.info(arrayItem);
		}
		logger.info("{}.", list);

		List<String> anotherList = Collections.emptyList();
		logger.info("List: {}.", anotherList);
		// Will generate an error as this is immutable
		// anotherList.add("Item 1");
		//logger.info("List: " + anotherList);
	}

	public static void createLinkedLists() {
		logger.info("");
		logger.info("### LINKEDLIST ACTIONS ###");

		// LinkedList
		LinkedList<String> linkedList = new LinkedList<>();

		// Adding elements to the linked list
		linkedList.add("A");
		linkedList.add("B");
		linkedList.addLast("D");
		linkedList.addFirst("E");
		linkedList.add(2, "C");
		linkedList.add("Z");
		linkedList.set(5, "F");
		logger.info("Filled linked list: {}.", linkedList);

		linkedList.remove("B");
		linkedList.remove(3);
		linkedList.removeFirst();
		linkedList.removeLast();

		logger.info("Updated linked list after removals: {}.", linkedList);
		logger.info("");

		linkedList.clear();
		linkedList.addAll(List.of("one", "two", "three", "four", "five"));
		logger.info("Filled linked list: {}.", linkedList);
		// Peek retrieves but not removes
		logger.info("Peek an item from linked list: {}.", linkedList.peek());
		// Poll retrieves and removes the first element
		logger.info("Poll an item from linked list: {}.", linkedList.poll());
		// Pop pops out an element present at the top of the stack.
		logger.info("Pop an item from linked list: {}.", linkedList.pop());
		// Offer adds the specified element as the tail (last element) of this list.
		logger.info("Offer an item from linked list: {}.", linkedList.offer("six"));
		// Offer adds the specified element at the front on this list.
		logger.info("Offer first an item from linked list: {}.", linkedList.offerFirst("two"));
		logger.info("Updated linked list: {}.", linkedList);
	}

	private static List<String> createList() {
		return Arrays.asList("Windows", "Linux", "iOS", "Android", "Mac OS X");
	}

	private static List<String> createList2() {
		List<String> anotherList = new ArrayList<>();
		anotherList.addAll(Arrays.asList("Windows", "Linux", "iOS", "Android", "Mac OS X"));
		return anotherList;
	}
}
