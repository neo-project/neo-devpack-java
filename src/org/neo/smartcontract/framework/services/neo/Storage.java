package org.neo.smartcontract.framework.services.neo;

import java.math.BigInteger;
import org.neo.smartcontract.framework.Syscall;

public final class Storage {
	@Syscall("Neo.Storage.GetContext")
	public native static StorageContext currentContext();

	@Syscall("Neo.Storage.Get")
	public native static byte[] get(StorageContext context, byte[] key);

	@Syscall("Neo.Storage.Get")
	public native static byte[] get(StorageContext context, String key);

	@Syscall("Neo.Storage.Put")
	public native static void put(StorageContext context, byte[] key, byte[] value);
	
	@Syscall("Neo.Storage.Put")
	public native static void put(StorageContext context, byte[] key, BigInteger value);

	@Syscall("Neo.Storage.Put")
	public native static void put(StorageContext context, byte[] key, String value);

	@Syscall("Neo.Storage.Put")
	public native static void put(StorageContext context, String key, byte[] value);
	
	@Syscall("Neo.Storage.Put")
	public native static void put(StorageContext context, String key, BigInteger value);

	@Syscall("Neo.Storage.Put")
	public native static void put(StorageContext context, String key, String value);

	@Syscall("Neo.Storage.Delete")
	public native static void delete(StorageContext context, byte[] key);

	@Syscall("Neo.Storage.Delete")
	public native static void delete(StorageContext context, String key);
}
