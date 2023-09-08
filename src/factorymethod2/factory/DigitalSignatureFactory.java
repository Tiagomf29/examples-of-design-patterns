package factorymethod2.factory;

import factorymethod2.domain.DigitalSignature;

public abstract class DigitalSignatureFactory {
	
	public DigitalSignature createAndExecuteDigitalSignature(byte[] document, byte[] certified) {
				
		DigitalSignature digitalSignature = createDigitalSignature();
		byte[] signature = digitalSignature.signature(document, certified);
		digitalSignature.verify(document, signature);
		
		return digitalSignature;
	}
	
	public abstract DigitalSignature createDigitalSignature();
	
}
