package factorymethod2.factory;

import factorymethod2.domain.CompanySignatureA;
import factorymethod2.domain.DigitalSignature;

public class DigitalSignatureFactoryCompanyA extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureA();
	}

}
