package com.pratik.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pratik.product.dto.Product;

public class roductDAOImplTest {

	@Test
	public void createShouldCreateProduct() {
		
		ProductDAO dao = new roductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("IPhone");
		product.setDescription("It's Awesome");
		product.setPrice(800);
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("IPhone", result.getName());
	}

}
