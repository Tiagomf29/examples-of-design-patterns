package factorymethod.factory;

import factorymethod.domain.CompanySignatureA;
import factorymethod.domain.DigitalSignature;

public class DigitalSignatureFactoryCompanyA extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureA();
	}

}
