package org.neo.smartcontract.framework.services.system;

import org.neo.smartcontract.framework.*;

public final class ExecutionEngine {
	@Syscall("System.ExecutionEngine.GetScriptContainer")
	public native static ScriptContainer scriptContainer();

	@Syscall("System.ExecutionEngine.GetExecutingScriptHash")
	public native static byte[] executingScriptHash();

	@Syscall("System.ExecutionEngine.GetCallingScriptHash")
	public native static byte[] callingScriptHash();

	@Syscall("System.ExecutionEngine.GetEntryScriptHash")
	public native static byte[] entryScriptHash();
}
