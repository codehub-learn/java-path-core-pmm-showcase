package gr.codelearn.core.showcase.oop;

import gr.codelearn.core.showcase.oop.model.Book;
import gr.codelearn.core.showcase.oop.model.Monitor;
import gr.codelearn.core.showcase.oop.model.ScreenType;
import gr.codelearn.core.showcase.oop.service.ProductService;
import gr.codelearn.core.showcase.oop.service.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class OopApplication {
	private static final Logger logger = LoggerFactory.getLogger(OopApplication.class);

	public static void main(String[] args) {
//		SimpleJavaLanguageExamples simpleJavaLanguageExamples = new SimpleJavaLanguageExamples();
//		simpleJavaLanguageExamples.mainExamples();

		Book book1 = new Book();
		book1.setName("Peri Tuflotitos");
		book1.setAuthor("Zoze Saramanp");
		book1.setPrice(new BigDecimal("14.99"));
		logger.info("{}",book1);

		Monitor monitor = new Monitor();
		monitor.setName("AXUS");
		monitor.setScreenType(ScreenType.IPS);
		monitor.setPrice(new BigDecimal("15.01"));
		logger.info("{}",monitor);

		Monitor monitor2 = new Monitor();
		monitor2.setName("AXUS");
		monitor2.setScreenType(ScreenType.IPS);
		monitor2.setPrice(new BigDecimal("15.00"));

		if (monitor.equals(monitor2))
			logger.info("Monitor {} is equal to monitor {}",monitor.getName(),monitor2.getName());
		else
			logger.info("Monitor {} is not equal to monitor {}",monitor.getName(),monitor2.getName());

		ProductService productService = new ProductServiceImpl();
		productService.printProductDetail(book1);

		logger.info("The total value of the products is: {}",productService.printTotalValue(book1,monitor,monitor2));


	}
}
