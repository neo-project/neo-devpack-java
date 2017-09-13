package org.neo.smartcontract.framework.services.neo;

public enum TriggerType {
	Verification(0x00), Application(0x10);

	private byte value;

	private TriggerType(int value) {
		this.value = (byte) value;
	}

	public byte value() {
		return value;
	}
}
