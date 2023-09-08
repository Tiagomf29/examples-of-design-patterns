package factorymethod2.factory;

import factorymethod2.domain.CompanySignatureB;
import factorymethod2.domain.DigitalSignature;

public class DigitalSignatureFactoryCompanyB extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureB();
	}

}
