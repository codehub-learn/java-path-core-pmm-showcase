package gr.codelearn.core.showcase.oop.model;

import java.math.BigDecimal;

public class Book extends Product {
	private String author;
	private int numOfPages;
	private BigDecimal ranking;

	public Book() {
	}

	public Book(final String name, final String serial, final BigDecimal price, final String author,
				final int numOfPages, final BigDecimal ranking) {
		super(name, serial, price);
		this.author = author;
		this.numOfPages = numOfPages;
		this.ranking = ranking;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(final int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public BigDecimal getRanking() {
		return ranking;
	}

	public void setRanking(final BigDecimal ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return super.toString() + ",Book{" + "author='" + author + '\'' + ", numOfPages=" + numOfPages + ", ranking=" +
				ranking + '}';
	}
}
