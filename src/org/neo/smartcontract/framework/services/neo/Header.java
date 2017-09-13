package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.*;

public class Header implements ScriptContainer {
	@Syscall("Neo.Header.GetHash")
	public native byte[] hash();

	@Syscall("Neo.Header.GetVersion")
	public native int version();

	@Syscall("Neo.Header.GetPrevHash")
	public native byte[] prevHash();

	@Syscall("Neo.Header.GetMerkleRoot")
	public native byte[] merkleRoot();

	@Syscall("Neo.Header.GetTimestamp")
	public native int timestamp();

	@Syscall("Neo.Header.GetConsensusData")
	public native long consensusData();

	@Syscall("Neo.Header.GetNextConsensus")
	public native byte[] nextConsensus();
}
