package com.pratik.product.BO;

import com.pratik.product.dao.ProductDAO;
import com.pratik.product.dao.roductDAOImpl;
import com.pratik.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new roductDAOImpl();  
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
