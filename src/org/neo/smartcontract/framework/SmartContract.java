package org.neo.smartcontract.framework;

import org.neo.vm._OpCode;

public class SmartContract {
	@OpCode(_OpCode.SHA1)
	protected native static byte[] sha1(byte[] data);

	@OpCode(_OpCode.SHA256)
	protected native static byte[] sha256(byte[] data);

	@OpCode(_OpCode.HASH160)
	protected native static byte[] hash160(byte[] data);

	@OpCode(_OpCode.HASH256)
	protected native static byte[] hash256(byte[] data);

	@OpCode(_OpCode.CHECKSIG)
	protected native static boolean verifySignature(byte[] signature, byte[] pubkey);

	@OpCode(_OpCode.CHECKMULTISIG)
	protected native static boolean verifySignatures(byte[][] signature, byte[][] pubkey);
}
