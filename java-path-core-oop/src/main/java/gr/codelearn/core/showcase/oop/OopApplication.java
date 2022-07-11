package gr.codelearn.core.showcase.oop;

import gr.codelearn.core.showcase.oop.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OopApplication {
	private static final Logger logger = LoggerFactory.getLogger(OopApplication.class);

	public static void main(String[] args) {
//		SimpleJavaLanguageExamples simpleJavaLanguageExamples = new SimpleJavaLanguageExamples();
//		simpleJavaLanguageExamples.mainExamples();

		Book book1 = new Book();
		logger.info(book1.toString());
	}
}
