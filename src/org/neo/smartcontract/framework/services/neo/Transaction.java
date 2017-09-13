package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.*;

public class Transaction implements ScriptContainer {
	@Syscall("Neo.Transaction.GetHash")
	public native byte[] hash();

	@Syscall("Neo.Transaction.GetType")
	public native byte type();

	@Syscall("Neo.Transaction.GetAttributes")
	public native TransactionAttribute[] attributes();

	@Syscall("Neo.Transaction.GetInputs")
	public native TransactionInput[] inputs();

	@Syscall("Neo.Transaction.GetOutputs")
	public native TransactionOutput[] outputs();

	@Syscall("Neo.Transaction.GetReferences")
	public native TransactionOutput[] references();
}
