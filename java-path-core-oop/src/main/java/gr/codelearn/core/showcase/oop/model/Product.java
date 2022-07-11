package gr.codelearn.core.showcase.oop.model;

import java.math.BigDecimal;

public class Product {
	private String name;
	private String serial;
	private BigDecimal price;

	public Product() {
	}

	public Product(final String name, final String serial, final BigDecimal price) {
		this.name = name;
		this.serial = serial;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(final String serial) {
		this.serial = serial;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (name != null ? !name.equals(product.name) : product.name != null) return false;
		if (serial != null ? !serial.equals(product.serial) : product.serial != null) return false;
		return price != null ? price.equals(product.price) : product.price == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (serial != null ? serial.hashCode() : 0);
		result = 31 * result + (price != null ? price.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", serial='" + serial + '\'' + ", price=" + price + '}';
	}
}
