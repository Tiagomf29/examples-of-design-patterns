package factorymethod2.factory;

import factorymethod2.domain.DigitalSignature;
import factorymethod2.service.CompanySignatureA;

public class DigitalSignatureFactoryCompanyA extends DigitalSignatureFactory{

	@Override
	public DigitalSignature createDigitalSignature() {

		return new CompanySignatureA();
	}

}
