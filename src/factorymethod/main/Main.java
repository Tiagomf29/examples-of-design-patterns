package factorymethod.main;

import factorymethod.domain.DigitalSignature;
import factorymethod.factory.DigitalSignatureFactory;
import factorymethod.factory.DigitalSignatureFactoryCompanyB;

public class Main {

	public static void main(String[] args) {
		
		//DigitalSignatureFactory digitalSignatureFactory = new DigitalSignatureFactoryCompanyA();
		DigitalSignatureFactory digitalSignatureFactory = new DigitalSignatureFactoryCompanyB();
		DigitalSignature digitalSignature = digitalSignatureFactory.createDigitalSignature();
		
		byte[] document  = {'E','X','A','M','P','L','E'};
		byte[] certified = {'E','X','A','M','P','L','E'};
		
		byte[] signature = digitalSignature.signature(document, certified);
		digitalSignature.verify(document, signature);

	}

}
