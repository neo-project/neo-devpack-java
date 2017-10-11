package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.Syscall;

public class Block extends Header {
	@Syscall("Neo.Block.GetTransactionCount")
	public native int transactionCount();

	@Syscall("Neo.Block.GetTransactions")
	public native Transaction[] transactions();

	@Syscall("Neo.Block.GetTransaction")
	public native Transaction getTransaction(int index);
}
