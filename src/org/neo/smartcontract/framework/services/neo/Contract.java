package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.Syscall;

public class Contract {
	@Syscall("Neo.Contract.GetScript")
	public native byte[] script();

	@Syscall("Neo.Contract.GetStorageContext")
	public native StorageContext storageContext();

	@Syscall("Neo.Contract.Create")
	public native static Contract create(byte[] script, byte[] parameter_list, byte return_type, boolean need_storage,
			String name, String version, String author, String email, String description);

	@Syscall("Neo.Contract.Migrate")
	public native static Contract migrate(byte[] script, byte[] parameter_list, byte return_type, boolean need_storage,
			String name, String version, String author, String email, String description);

	@Syscall("Neo.Contract.Destroy")
	public native static void destroy();
}
