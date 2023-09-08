package simplefactory.main;

import simplefactory.domain.DigitalSignature;
import simplefactory.enumerations.Company;
import simplefactory.factory.DigitalSignatureFactory;

public class Main {

	public static void main(String[] args) {
		
		//DigitalSignature digitalSignature = DigitalSignatureFactory.createDigitalSignature(Company.EMPRESA_A);
		DigitalSignature digitalSignature = DigitalSignatureFactory.createDigitalSignature(Company.EMPRESA_A);
		
		byte[] document  = {'E','X','A','M','P','L','E'};
		byte[] certified = {'E','X','A','M','P','L','E'};
		
		byte[] signature = digitalSignature.signature(document, certified);
		digitalSignature.verify(document, signature);

	}

}
