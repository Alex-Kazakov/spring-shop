package com.irlix.interview.task.shop.springshop;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.irlix.interview.task.shop.springshop.model.Product;
import com.irlix.interview.task.shop.springshop.repository.ProductRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ProductRepositoryTests {

	@Autowired
	private ProductRepository repo;

	@Test
	public void testCreateProduct() {
		Product product = new Product();
		product.setName("Test Product");
		product.setPrice(10.0);
		product.setQuantity(5);
		Product savedProduct = repo.save(product);

		Optional<Product> optionalProductFromRep = repo.findById(savedProduct.getId());

		assertThat(optionalProductFromRep.isPresent());

		Product productFromRep = optionalProductFromRep.get();
		assertThat(product.getName()).isEqualTo(productFromRep.getName());
	}
}
