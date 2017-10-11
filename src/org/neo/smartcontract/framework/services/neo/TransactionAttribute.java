package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.*;

public class TransactionAttribute implements ApiInterface {
	@Syscall("Neo.Attribute.GetUsage")
	public native byte usage();

	@Syscall("Neo.Attribute.GetData")
	public native byte[] data();
}
