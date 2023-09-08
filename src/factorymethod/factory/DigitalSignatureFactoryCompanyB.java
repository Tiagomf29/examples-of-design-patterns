package factorymethod.factory;

import factorymethod.domain.DigitalSignature;
import factorymethod.service.CompanySignatureB;

public class DigitalSignatureFactoryCompanyB extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureB();
	}

}
