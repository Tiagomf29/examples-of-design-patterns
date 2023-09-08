package factorymethod2.domain;

public interface DigitalSignature {
	
	public byte[] signature(byte[] document, byte[] certified);
	public void verify(byte[] document, byte[] signature);

}
