package gr.codelearn.core.showcase.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	private static final Logger logger = LoggerFactory.getLogger(CollectionApplication.class);

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

		logger.info("{}", objectObjectHashMap.get("Collections"));

		objectObjectHashMap.put("Collections", objectObjectHashMap.get("Collections") + 1);

		logger.info("{}", objectObjectHashMap.get("Collections"));

		objectObjectHashMap.getOrDefault("Collections", 0L);
	}

	private static void queueShowcase() {
		Deque<String> objects = new LinkedList<>();
		objects.offer("A");
		objects.offer("B");
		objects.offer("C");
		logger.info("{}", objects);
		logger.info("{}", objects.poll());
		logger.info("{}", objects);
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

		logger.info("{}", names);
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
		logger.info("{}", integers);

		integers.clear();
		List<Integer> newIntegers = List.of(2, 3);
		integers.add(1);
		integers.add(2);
		integers.addAll(newIntegers);
		logger.info("{}", integers);
		integers.removeAll(newIntegers);
		logger.info("{}", integers);


		final ArrayList<Object> objects1 = new ArrayList<>(100);
		logger.info("{}", objects1.size());

		final ArrayList<String> names = new ArrayList<>();
		names.add("Ioannis");
		names.add("Wagedu");
		names.add("John");
		names.add("Jan");
		names.add("Ioanna");

		logger.info("{}", names);

		Collections.sort(names);

		logger.info("{}", names);

		names.sort(new Comparator<String>() {
			@Override
			public int compare(final String o1, final String o2) {
				// <0 o2 larger
				// 0 o1=o2
				// >0 o1
				return o2.length() - o1.length();
			}
		});

		logger.info("{}", names);


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
		logger.info("{}", integers);
	}

	private static void arraysShowcase(){
		int[] ints = new int[10];
		logger.info("{}", ints[0]);

		final String[] strings = new String[10];
		logger.info("{}", strings[0]);

		int[] ints1 = {10, 0, 50, 25, 73};

		for (int i = 0; i < ints1.length; i++) {
			logger.info("{}", ints1[i]);
		}

		for (int i : ints1) {
			logger.info("{}", i);
		}
	}


}
