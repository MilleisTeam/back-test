package fr.milleis.testback.usecase.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.milleis.testback.usecase.dto.User;
import fr.milleis.testback.usecase.exception.ValidationException;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@InjectMocks
	private UserService userService;

	@Test
	public void shouldFail() {
		UserService userService = new UserService();
		assertThrows(ValidationException.class, () -> userService.checkUser(new User()));
	}

	@Test
	public void testOk() {
		var user = User.builder()
				.name("name")
				.email("email")
				.id("id")
				.build();
		assertDoesNotThrow(() -> userService.checkUser(user));
	}

}
