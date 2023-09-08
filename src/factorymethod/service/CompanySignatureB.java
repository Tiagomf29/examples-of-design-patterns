package factorymethod.service;

import factorymethod.domain.DigitalSignature;

public class CompanySignatureB implements DigitalSignature{

	@Override
	public byte[] signature(byte[] document, byte[] certified) {
		
		byte[] signature = {'E','X','A','M','P','L','E'};
		
		System.out.println("signing documents with digital signature - Company B");
		
		return signature;
	}

	@Override
	public void verify(byte[] document, byte[] signature) {
		System.out.println("verifying documents with digital signature - Company B");
	}

}
