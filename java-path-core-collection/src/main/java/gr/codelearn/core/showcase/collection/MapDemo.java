package gr.codelearn.core.showcase.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
	private static final Logger logger = LoggerFactory.getLogger(MapDemo.class);

	public static void createMap() {
		logger.info("### MAP CREATE ACTIONS ###");

		// In the following code an empty map with keys and objects of type Strings is initialized.
		Map<String, String> map = Map.of();

		// Initialize a unmodifiable map with Map.of for small maps
		Map<String, String> map2 = Map.of("key1", "value1", "key2", "value2");

		// Initialize an unmodifiable map via the Map.ofEntries();
		Map<String, String> map3 = Map.ofEntries(Map.entry("key1", "value1"), Map.entry("key2", "value2"),
												 Map.entry("key100", "value100"));
		// Print an unmodifiable map
		logger.info("{}.", map3);
		logger.info("");

		// Initialize map  via the new operator
		Map<String, String> map4 = new HashMap<>();
		map4.put("Android", "Mobile");
		map4.put("Eclipse IDE", "Java");
		map4.put("Eclipse RCP", "Java");
		map4.put("Git", "Version control system");

		// Remove an entry from a map
		map4.remove("Android");

		// Process the map
		map4.forEach((k, v) -> logger.info("{}:{}", k, v));
	}

	public static void otherMapActions() {
		logger.info("");
		logger.info("### MAP OTHER ACTIONS ###");

		// Convert keys in a Map to an array or a list
		Map<String, String> map = new HashMap<>();
		map.put("Android", "Mobile");
		map.put("Eclipse IDE", "Java");
		map.put("Eclipse RCP", "Java");
		map.put("Git", "Version control system");

		// Convert keys to array
		String[] keysArray = map.keySet().toArray(new String[map.keySet().size()]);
		// Printing keys stored in an array
		for (String key : keysArray) {
			logger.info("{}.", key);
		}
		logger.info("");

		// Convert keys to list
		List<String> keysList = new ArrayList<>(map.keySet());
		// Printing keys stored in an array
		keysList.forEach(logger::info);
		logger.info("");

		// Getting the current value or a default for a map
		Map<String, Integer> testMap = new HashMap<>();
		testMap.put("Android", 1 + testMap.getOrDefault("Android", 0));

		// Write to command line
		testMap.forEach((k, v) -> logger.info("{}:{}", k, v));
		logger.info("");

		// Compute if absent
		Map<String, Integer> computeMap = new HashMap<>();
		computeMap.computeIfAbsent("Java", it -> 0);
		logger.info("Compute if absent");
		logger.info("-------------------");
		computeMap.keySet().forEach(key -> logger.info("{}:{}", key, computeMap.get(key)));
		logger.info("");

		// Compute if present
		computeMap.computeIfPresent("Java", (k, v) -> 10);
		logger.info("Compute if present");
		logger.info("-------------------");
		computeMap.keySet().forEach(key -> logger.info("{}:{}", key, computeMap.get(key)));
		logger.info("");

		// Merge
		computeMap.merge("Java", 1000, (previousValue, newValue) -> previousValue + newValue);
		computeMap.merge("Kotlin", 99, Integer::sum);
		logger.info("Merge");
		logger.info("-------------------");
		computeMap.keySet().forEach(key -> logger.info("{}:{}", key, computeMap.get(key)));
	}
}
