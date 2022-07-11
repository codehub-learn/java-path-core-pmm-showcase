package gr.codelearn.core.showcase.oop.service;

import gr.codelearn.core.showcase.oop.model.Product;

import java.math.BigDecimal;

public interface ProductService {
	void printProductDetail(Product product);
	BigDecimal printTotalValue(Product... products);
}
