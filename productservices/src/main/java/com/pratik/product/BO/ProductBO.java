package com.pratik.product.BO;

import com.pratik.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	
	Product findProduct(int id);
	
}
