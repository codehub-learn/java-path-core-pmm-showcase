package gr.codelearn.core.showcase.collection;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {
	private final static String LINE_DELIMITER = "------------------------------------------------------------";
	private static final Logger logger = LoggerFactory.getLogger(ArrayDemo.class);
	private static final Lorem generator = LoremIpsum.getInstance();

	public static void arrayDefaultValues() {
		logger.info("### ARRAY DEFAULT VALUES ###");

		logger.info("String array default values:");
		var stringBuilder = new StringBuilder();
		var stringArray = new String[3];
		for (String val : stringArray) {
			stringBuilder.append(val).append(" ");
		}
		logger.info("{} ", stringBuilder);
		logger.info(LINE_DELIMITER);

		logger.info("Integer array default values:");
		var stringBuilder2 = new StringBuilder();
		int[] integerArray = new int[3];
		for (int val : integerArray) {
			stringBuilder2.append(val).append(" ");
		}
		logger.info("{} ", stringBuilder2);
		logger.info(LINE_DELIMITER);

		logger.info("Double array default values:");
		double[] doubleArray = new double[3];
		var stringBuilder3 = new StringBuilder();
		for (double val : doubleArray) {
			stringBuilder3.append(val).append(" ");
		}
		logger.info("{} ", stringBuilder3);
		logger.info(LINE_DELIMITER);

		logger.info("Boolean array default values:");
		var booleanArray = new boolean[3];
		var stringBuilder4 = new StringBuilder();
		for (boolean val : booleanArray) {
			stringBuilder4.append(val).append(" ");
		}
		logger.info("{} ", stringBuilder4);
		logger.info(LINE_DELIMITER);

		logger.info("Reference Array default values:");
		var myArray = new ArrayDemo[3];
		var stringBuilder5 = new StringBuilder();
		for (ArrayDemo val : myArray) {
			stringBuilder5.append(val).append(" ");
		}
		logger.info("{} ", stringBuilder5);
		logger.info(LINE_DELIMITER);
	}

	public static void integerArrayActions() {
		logger.info("");
		logger.info("### INTEGER ARRAY ACTIONS ###");

		// Declaring array literal the old way
		int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Declaring array literal the new way
		int[] intArrayTheNewWay = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Using classic looping
		var loggingContent = new StringBuilder();
		for (int i = 0; i < intArrayTheNewWay.length; i++) {
			loggingContent.append(intArrayTheNewWay[i]).append(" ");
		}
		logger.info("Classic looping: {}", loggingContent);
		logger.info(LINE_DELIMITER);

		// Using for enhanced loop
		var loggingContent2 = new StringBuilder();
		for (int i : intArrayTheNewWay) {
			loggingContent2.append(i).append(" ");
		}
		logger.info("Enhanced looping: {}", loggingContent2);
		logger.info(LINE_DELIMITER);

		// Declaring and initializing 2D array
		int[][] intArray2D = {{1, 3, 5, 7, 9, 11}, {2, 4, 6, 8, 10, 13}, {1, 1, 2, 3, 5, 8, 13, 21}};

		// printing 2D array
		var loggingContent3 = new StringBuilder();
		for (int i = 0; i < intArray2D.length; i++) {
			for (int j = 0; j < intArray2D[i].length; j++) {
				loggingContent3.append(intArray2D[i][j]).append(" ");
			}
			loggingContent3.append(", ");
		}
		logger.info("Looping 2D array: {}", loggingContent3.substring(0, loggingContent3.length() - ", ".length()));
		logger.info(LINE_DELIMITER);

		// Clone array
		int[] cloneArray = intArray.clone();

		// Will print false as deep copy is created for one-dimensional array
		logger.info("Arrays generated with clone command are {} and {}.",
					intArray == cloneArray ? "identical" : "different",
					Arrays.equals(intArray, cloneArray) ? "equal" : "not equal");
		logger.info(LINE_DELIMITER);
	}

	public static void stringArrayActions() {
		logger.info("");
		logger.info("### STRING ARRAY ACTIONS ###");

		// Get some random generated strings
		var generatedStringArray = generateRandomStrings(10);
		logger.info("Print array contents:");
		printArrayContents(generatedStringArray);

		// Create a copy of that string filled array
		var copiedGeneratedStringArray = Arrays.copyOf(generatedStringArray, generatedStringArray.length);
		logger.info("Print copied array contents:");
		printArrayContents(copiedGeneratedStringArray);

		// Create a copy containing a subset of that string filled array
		var copiedSubsetOfGeneratedStringArray = Arrays.copyOfRange(generatedStringArray,
																	generatedStringArray.length - 4,
																	generatedStringArray.length);
		logger.info("Print copied array subset contents:");
		printArrayContents(copiedSubsetOfGeneratedStringArray);

		// Sort the contents
		Arrays.sort(copiedSubsetOfGeneratedStringArray);
		logger.info("Print sorted copied array subset contents:");
		printArrayContents(copiedSubsetOfGeneratedStringArray);

		// Sort in a custom way (reversed order)
		Arrays.sort(copiedSubsetOfGeneratedStringArray, new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				// Intentional: Reverse order for this demo
				return o2.compareTo(o1);
			}
		});
		logger.info("Print custom sorted (Descending by name) copied array subset contents:");
		printArrayContents(copiedSubsetOfGeneratedStringArray);
	}

	public static void otherArrayActions() {
		logger.info("");
		logger.info("### OTHER ARRAY ACTIONS ###");

		// Fill an array
		var fillableArray = new int[10];
		Arrays.fill(fillableArray, 123);
		logger.info("Print filled array content:");
		printArrayContents(fillableArray);

		// Search for a value
		int[] intArray = {1, 3, 5, 7, 9, 11};
		int index = Arrays.binarySearch(intArray, 12);
		logger.info("Found 12 at position {}.", index);
		index = Arrays.binarySearch(intArray, 3);
		logger.info("Found 3 at position {}.", index);
		index = Arrays.binarySearch(intArray, 7);
		logger.info("Found 7 at position {}.", index);
		logger.info("");

		// Check equality
		int[] ints1 = {0, 2, 4, 6, 8, 10};
		int[] ints2 = {0, 2, 4, 6, 8, 10};
		int[] ints3 = {10, 8, 6, 4, 2, 0};

		boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
		boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

		logger.info("Arrays ints1 and ints2 are equal? {}.", ints1EqualsInts2);
		logger.info("Arrays ints1 and ints3 are equal? {}.", ints1EqualsInts3);
	}

	private static void printArrayContents(int[] array) {
		for (int i = 0; i < array.length; i++) {
			logger.info("{}. {}", i + 1, array[i]);
		}
		logger.info(LINE_DELIMITER);
	}

	private static void printArrayContents(String[] array) {
		for (int i = 0; i < array.length; i++) {
			logger.info("{}. {}", i + 1, array[i]);
		}
		logger.info(LINE_DELIMITER);
	}

	private static String[] generateRandomStrings(int howMany) {
		String[] names = new String[howMany];
		for (int i = 0; i < howMany; i++) {
			names[i] = generator.getFirstName();
		}
		return names;
	}
}
