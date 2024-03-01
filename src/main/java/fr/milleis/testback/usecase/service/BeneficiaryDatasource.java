package fr.milleis.testback.usecase.service;

import org.springframework.stereotype.Component;

import fr.milleis.testback.usecase.dto.Beneficiary;

@Component
public class BeneficiaryDatasource {
	public boolean addBeneficiary(Beneficiary beneficiary) {
		return true;
	}
}