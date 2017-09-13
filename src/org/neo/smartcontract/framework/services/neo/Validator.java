package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.Syscall;

public final class Validator {
	@Syscall("Neo.Validator.Register")
	public native static Validator register(byte[] pubkey);
}
