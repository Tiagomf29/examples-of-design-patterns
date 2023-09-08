package factorymethod2.main;

import factorymethod2.factory.DigitalSignatureFactory;
import factorymethod2.factory.DigitalSignatureFactoryCompanyA;

public class Main {

	public static void main(String[] args) {

		//DigitalSignatureFactory digitalSignatureFactory = new DigitalSignatureFactoryCompanyB();
		DigitalSignatureFactory digitalSignatureFactory = new DigitalSignatureFactoryCompanyA();
		
		byte[] document  = {'E','X','A','M','P','L','E'};
		byte[] certified = {'E','X','A','M','P','L','E'};
		
		// despite solving a problem, this form of implementation violates the principle of single responsibility.
		digitalSignatureFactory.createAndExecuteDigitalSignature(document, certified);

	}

}
