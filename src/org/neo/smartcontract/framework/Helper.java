package org.neo.smartcontract.framework;

import java.math.BigInteger;
import org.neo.vm._OpCode;

public class Helper {
	@Nonemit
	public native static BigInteger asBigInteger(byte[] source);

	@Nonemit
	public native static byte[] asByteArray(BigInteger source);

	@Nonemit
	public native static byte[] asByteArray(String source);

	@Nonemit
	public native static String asString(byte[] source);

	@OpCode(_OpCode.CAT)
	public native static byte[] concat(byte[] first, byte[] second);

	@OpCode(_OpCode.SUBSTR)
	public native static byte[] range(byte[] source, int index, int count);

	@OpCode(_OpCode.LEFT)
	public native static byte[] take(byte[] source, int count);
}
