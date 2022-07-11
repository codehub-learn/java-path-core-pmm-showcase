package gr.codelearn.core.showcase.oop.model;

import java.math.BigDecimal;

public class Book {
	private String name;
	private String serial;
	private BigDecimal price;
	private String author;
	private int numOfPages;
	private BigDecimal ranking;

	@Override
	public String toString() {
		return "Book{" + "name='" + name + '\'' + ", serial='" + serial + '\'' + ", price=" + price + ", author='" +
				author + '\'' + ", numOfPages=" + numOfPages + ", ranking=" + ranking + '}';
	}
}
