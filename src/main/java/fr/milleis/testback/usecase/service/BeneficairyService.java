package fr.milleis.testback.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.milleis.testback.usecase.dto.Beneficiary;
import fr.milleis.testback.usecase.dto.User;

@Service
public class BeneficairyService {

	@Autowired
	private BeneficiaryDatasource beneficiaryDatasource;

	/**
	 * check if iban empty && > 20 char
	 * check if bic empty && > 11 char
	 * check if address empty
	 * check if city empty
	 * check if country empty
	 * check if name empty
	 * check if address , city and country are not same
	 * 
	 * @param beneficiary
	 */
	public void checkBeneficiary(Beneficiary beneficiary) {
		throw new UnsupportedOperationException();
	}

	/**
	 * return true if beneficiary added
	 * 
	 * @param beneficiary
	 * @param user
	 * @return
	 */
	public boolean addBeneficiary(Beneficiary beneficiary, User user) {
		return beneficiaryDatasource.addBeneficiary(beneficiary);
	}
}