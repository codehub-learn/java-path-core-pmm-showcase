package gr.codelearn.core.showcase.oop.service;

import gr.codelearn.core.showcase.oop.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ProductServiceImpl implements ProductService{
	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Override
	public void printProductDetail(final Product product) {
		logger.info("The product with name: {} and price: {}",product.getName(),product.getPrice());
	}

	@Override
	public BigDecimal printTotalValue(final Product... products) {
		BigDecimal totalValue = new BigDecimal(0);
		for (final Product product : products) {
			totalValue = totalValue.add(product.getPrice());
		}
		return totalValue;
	}
}
