package simplefactory.factory;

import simplefactory.domain.CompanySignatureA;
import simplefactory.domain.CompanySignatureB;
import simplefactory.domain.DigitalSignature;
import simplefactory.enumerations.Company;

public abstract class DigitalSignatureFactory {
	
	public static DigitalSignature createDigitalSignature(Company company) {
				
		switch (company) {
			case EMPRESA_A : return new CompanySignatureA();
			case EMPRESA_B : return new CompanySignatureB();		
		default:
			throw new IllegalArgumentException("Unexpected value: " + company);
		}
		
	}
	
}
