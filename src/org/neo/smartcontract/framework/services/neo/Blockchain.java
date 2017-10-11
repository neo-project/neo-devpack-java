package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.Syscall;

public class Blockchain {
	@Syscall("Neo.Blockchain.GetHeight")
	public native static int height();

	@Syscall("Neo.Blockchain.GetHeader")
	public native static Header getHeader(int height);

	@Syscall("Neo.Blockchain.GetHeader")
	public native static Header getHeader(byte[] hash);

	@Syscall("Neo.Blockchain.GetBlock")
	public native static Block getBlock(int height);

	@Syscall("Neo.Blockchain.GetBlock")
	public native static Block getBlock(byte[] hash);

	@Syscall("Neo.Blockchain.GetTransaction")
	public native static Transaction getTransaction(byte[] hash);

	@Syscall("Neo.Blockchain.GetAccount")
	public native static Account getAccount(byte[] script_hash);

	@Syscall("Neo.Blockchain.GetValidators")
	public native static byte[][] getValidators();

	@Syscall("Neo.Blockchain.GetAsset")
	public native static Asset getAsset(byte[] asset_id);

	@Syscall("Neo.Blockchain.GetContract")
	public native static Contract getContract(byte[] script_hash);
}
