package factorymethod.factory;

import factorymethod.domain.DigitalSignature;
import factorymethod.service.CompanySignatureA;

public class DigitalSignatureFactoryCompanyA extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureA();
	}

}
