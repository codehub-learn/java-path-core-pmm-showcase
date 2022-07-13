package gr.codelearn.core.showcase.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionApplication {
	public static void main(String[] args) {
		//arraysShowcase();
		//arrayListShowcase();
		//linkedListShowcase();
		//setShowcase();
		//queueShowcase();
		//mapShowcase();
	}

	private static void mapShowcase() {
		final HashMap<String, Long> objectObjectHashMap = new HashMap<>();
		objectObjectHashMap.put("Collections", 0L);

		System.out.println(objectObjectHashMap.get("Collections"));

		objectObjectHashMap.put("Collections", objectObjectHashMap.get("Collections") + 1);

		System.out.println(objectObjectHashMap.get("Collections"));

		objectObjectHashMap.getOrDefault("Collections", 0L);
	}

	private static void queueShowcase() {
		Deque<String> objects = new LinkedList<>();
		objects.offer("A");
		objects.offer("B");
		objects.offer("C");
		System.out.println(objects);
		System.out.println(objects.poll());
		System.out.println(objects);
	}

	private static void setShowcase(){
		final Set<String> names = new HashSet<>();
		names.add("Ioannis");
		names.add("Wagedu");
		names.add("John");
		names.add("Jan");
		names.add("Jan");
		names.add("Jan");
		names.add("Jan");
		names.add("Jan");
		names.add("Jan");

		System.out.println(names);
	}

	private static void arrayListShowcase() {
		final ArrayList<Object> objects = new ArrayList<>();
		objects.add("1");
		objects.add(2);
		objects.add(2L);

		List<Integer> integers = new ArrayList<>();
		integers.add(2);
		integers.add(5);
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(8);
		integers.set(3, 2);
		integers.add(0, 100);
		System.out.println(integers);

		integers.clear();
		List<Integer> newIntegers = List.of(2, 3);
		integers.add(1);
		integers.add(2);
		integers.addAll(newIntegers);
		System.out.println(integers);
		integers.removeAll(newIntegers);
		System.out.println(integers);


		final ArrayList<Object> objects1 = new ArrayList<>(100);
		System.out.println(objects1.size());

		final ArrayList<String> names = new ArrayList<>();
		names.add("Ioannis");
		names.add("Wagedu");
		names.add("John");
		names.add("Jan");
		names.add("Ioanna");

		System.out.println(names);

		Collections.sort(names);

		System.out.println(names);

		names.sort(new Comparator<String>() {
			@Override
			public int compare(final String o1, final String o2) {
				// <0 o2 larger
				// 0 o1=o2
				// >0 o1
				return o2.length() - o1.length();
			}
		});

		System.out.println(names);


	}

	private static void linkedListShowcase() {
		final LinkedList<Object> objects = new LinkedList<>();
		objects.add("1");
		objects.add(2);
		objects.add(2L);

		List<Integer> integers = new LinkedList<>();
		integers.add(2);
		integers.add(5);
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(8);
		integers.set(3, 2);
		integers.add(0, 100);
		System.out.println(integers);
	}

	private static void arraysShowcase(){
		int[] ints = new int[10];
		System.out.println(ints[0]);

		final String[] strings = new String[10];
		System.out.println(strings[0]);

		int[] ints1 = {10, 0, 50, 25, 73};

		for (int i = 0; i < ints1.length; i++) {
			System.out.println(ints1[i]);
		}

		for (int i : ints1) {
			System.out.println(i);
		}
	}
}
