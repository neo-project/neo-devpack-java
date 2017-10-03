package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.*;

public class TransactionOutput implements ApiInterface {
	@Syscall("Neo.Output.GetAssetId")
	public native byte[] assetId();

	@Syscall("Neo.Output.GetValue")
	public native long value();

	@Syscall("Neo.Output.GetScriptHash")
	public native byte[] scriptHash();
}
