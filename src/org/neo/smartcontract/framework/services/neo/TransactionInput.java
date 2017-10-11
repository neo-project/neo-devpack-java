package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.*;

public class TransactionInput implements ApiInterface {
	@Syscall("Neo.Input.GetHash")
	public native byte[] prevHash();

	@Syscall("Neo.Input.GetIndex")
	public native short prevIndex();
}
