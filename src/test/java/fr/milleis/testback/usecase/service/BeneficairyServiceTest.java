package fr.milleis.testback.usecase.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.milleis.testback.usecase.dto.Beneficiary;
import fr.milleis.testback.usecase.dto.User;
import fr.milleis.testback.usecase.exception.ValidationException;

@ExtendWith(MockitoExtension.class)
public class BeneficairyServiceTest {

	@Mock
	private BeneficiaryDatasource beneficiaryDatasource;
	@Mock
	private UserService userService;

	@InjectMocks
	private BeneficairyService beneficairyService;

	@Test
	public void testOk() {
		var be = Beneficiary.builder().address("adress").city("city").bic("bic").iban("iban").id("id").name("name")
				.build();
		assertThrows(ValidationException.class, () -> beneficairyService.checkBeneficiary(be));
	}

	@Test
	public void shouldFailValidationException() {

		assertThrows(ValidationException.class, () -> beneficairyService.checkBeneficiary(new Beneficiary()));
	}

	@Test
	public void shouldFailIfBeneficiaryhasSame() {
		var be = Beneficiary.builder().address("adress").city("adress").bic("bic").iban("iban").id("id").name("name")
				.build();
		assertThrows(ValidationException.class, () -> beneficairyService.checkBeneficiary(be));
	}

}
