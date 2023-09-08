package factorymethod.factory;

import factorymethod.domain.CompanySignatureB;
import factorymethod.domain.DigitalSignature;

public class DigitalSignatureFactoryCompanyB extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureB();
	}

}
