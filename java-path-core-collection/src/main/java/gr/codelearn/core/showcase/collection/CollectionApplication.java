package gr.codelearn.core.showcase.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CollectionApplication {
	private static final Logger logger = LoggerFactory.getLogger(CollectionApplication.class);

	public static void main(String[] args) {
		ArrayDemo.arrayDefaultValues();
		ArrayDemo.integerArrayActions();
		ArrayDemo.stringArrayActions();
		ArrayDemo.otherArrayActions();

		ListDemo.createLists();
		ListDemo.otherListActions();
		ListDemo.conventionListActions();
		ListDemo.createLinkedLists();

		SetDemo.createSets();
		SetDemo.createTreeSet();
		SetDemo.createLinkedHashSet();

		MapDemo.createMap();
		MapDemo.otherMapActions();

		QueueDemo.createQueues();
	}
}
