package fr.milleis.testback.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.milleis.testback.usecase.dto.Beneficiary;
import fr.milleis.testback.usecase.dto.User;
import fr.milleis.testback.usecase.service.BeneficairyService;
import fr.milleis.testback.usecase.service.UserService;

@Component
public class PostBeneficiaryUsecase {

	@Autowired
	private BeneficairyService beneficairyService;
	private UserService userService;

	public boolean run(Beneficiary beneficiary, User user) {
		userService.checkUser(user);
		beneficairyService.checkBeneficiary(beneficiary);
		return beneficairyService.addBeneficiary(beneficiary, user);
	}
}