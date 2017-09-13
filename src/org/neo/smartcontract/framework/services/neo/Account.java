package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.Syscall;

public class Account {
	@Syscall("Neo.Account.GetScriptHash")
	public native byte[] scriptHash();

	@Syscall("Neo.Account.GetVotes")
	public native byte[][] getVotes();

	@Syscall("Neo.Account.SetVotes")
	public native void setVotes(byte[][] votes);

	@Syscall("Neo.Account.GetBalance")
	public native long getBalance(byte[] asset_id);
}
