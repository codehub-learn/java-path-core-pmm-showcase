package gr.codelearn.core.showcase.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class QueueDemo {
	private static final Logger logger = LoggerFactory.getLogger(QueueDemo.class);

	public static void main(String[] args) {
		createQueues();
	}

	public static void createQueues() {
		logger.info("### QUEUE CREATE ACTIONS ###");

		PriorityQueue<String> sampleQueue = new PriorityQueue<>();
		List<String> newList = createList();
		Collections.sort(newList);
		sampleQueue.addAll(newList);

		logger.info("Head: {}", sampleQueue.element());
		logger.info("Head: {}", sampleQueue.peek());
		logger.info("");

		logger.info("Iterating the queue elements:");
		Iterator itr = sampleQueue.iterator();
		while (itr.hasNext()) {
			logger.info("{}", itr.next());
		}
		logger.info("");

		sampleQueue.remove();
		sampleQueue.poll();
		sampleQueue.offer("Bill");

		logger.info("After removing two elements and offering one:");
		for (String item : sampleQueue) {
			logger.info("{}", item);
		}

		logger.info("");
		logger.info("Sorted");
		// Returning contents sorted
		String[] array = new String[sampleQueue.size()];
		sampleQueue.toArray(array);
		Arrays.sort(array);
		for (String item : array) {
			logger.info("{}", item);
		}
	}

	private static List<String> createList() {
		return Arrays.asList("George", "Constantinos", "John", "Mary", "Helen", "Paul", "David", "Amelie", "Kate");
	}
}
