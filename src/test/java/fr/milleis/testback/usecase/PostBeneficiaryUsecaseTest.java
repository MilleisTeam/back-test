package fr.milleis.testback.usecase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.milleis.testback.usecase.dto.Beneficiary;
import fr.milleis.testback.usecase.dto.User;
import fr.milleis.testback.usecase.service.BeneficairyService;
import fr.milleis.testback.usecase.service.UserService;

@ExtendWith(MockitoExtension.class)
public class PostBeneficiaryUsecaseTest {

	@Mock
	private BeneficairyService beneficairyService;

	@Mock
	private UserService userService;

	@InjectMocks
	private PostBeneficiaryUsecase postBeneficiaryUsecase;

	@Test
	public void testOk() {
		when(beneficairyService.addBeneficiary(new Beneficiary(), new User())).thenReturn(true);
		assertEquals(true, postBeneficiaryUsecase.run(new Beneficiary(), new User()));
	}
}
