package gr.codelearn.core.showcase.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {

	private static final Logger logger = LoggerFactory.getLogger(StreamApplication.class);

	public static void main(String[] args) {
		Integer[] integersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Arrays.stream(integersArray);

		List<Integer> integersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream<Integer> stream = integersList.stream();
		stream.filter(integer -> integer > 5).sorted().forEach(integer -> logger.info("{}", integer));
		logger.info("{}", integersList);

		List<Integer> integers = Arrays.asList(integersArray);
		List.of(1, 2);

		List<Transaction> transactions = List.of(new Transaction(5, 100), new Transaction(2, 28),
												 new Transaction(1, 50), new Transaction(3, 110),
												 new Transaction(10, 101));

		//@formatter:off
		Map<Integer,Transaction> collect = transactions.stream()
					.filter(transaction -> transaction.getValue() >= 50)
					.sorted(Comparator.comparing(Transaction::getId).reversed())
					//.map(Transaction::getId)
		//			.collect(Collectors.toList());
					.collect(Collectors.toMap(Transaction::getId, transaction -> transaction));
					//.forEach(transaction -> logger.info("{}", transaction));
		//@formatter:on
		collect.forEach((integer, transaction) -> logger.info("key: {}, value: {}", integer, transaction));
		//@formatter:off
		Double asDouble = transactions.stream()
					.mapToInt(Transaction::getId)
					.average()
				    .getAsDouble();
		logger.info("{}", asDouble);
		//@formatter:on

		Map<Object, Object> randomMap = Map.of();
		randomMap.forEach((k, v) -> logger.info("key: {}, value: {}", k, v));
	}

}
