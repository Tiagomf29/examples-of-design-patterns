package factorymethod2.factory;

import factorymethod2.domain.DigitalSignature;
import factorymethod2.service.CompanySignatureB;

public class DigitalSignatureFactoryCompanyB extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureB();
	}

}
