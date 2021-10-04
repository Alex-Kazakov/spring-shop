package com.irlix.interview.task.shop.springshop;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.irlix.interview.task.shop.springshop.model.User;
import com.irlix.interview.task.shop.springshop.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
	private UserRepository repo;

	@Test
	public void testCreateUser() {
		User user = new User();
		user.setLogin("user");
		user.setPassword("user");
		user.setFirstName("Alex");
		user.setLastName("Kazakov");

		User savedUser = repo.save(user);

		Optional<User> optionalUserFromRep = repo.findById(savedUser.getId());

		assertThat(optionalUserFromRep.isPresent());

		User userFromRep = optionalUserFromRep.get();
		assertThat(user.getLogin()).isEqualTo(userFromRep.getLogin());
	}
}
