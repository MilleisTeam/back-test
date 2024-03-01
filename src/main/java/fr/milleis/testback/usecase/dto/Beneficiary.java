package fr.milleis.testback.usecase.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Beneficiary {

	private String id;
	private String name;
	private String iban;
	private String bic;
	private String address;
	private String city;
	private String country;

}