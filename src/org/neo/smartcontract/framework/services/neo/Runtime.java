package org.neo.smartcontract.framework.services.neo;

import org.neo.smartcontract.framework.Syscall;

public final class Runtime {
	@Syscall("Neo.Runtime.GetTrigger")
	public native static TriggerType trigger();

	@Syscall("Neo.Runtime.CheckWitness")
	public native static boolean checkWitness(byte[] hashOrPubkey);

	@Syscall("Neo.Runtime.Notify")
	public native static void notify(Object... state);

	@Syscall("Neo.Runtime.Log")
	public native static void log(String message);

	@Syscall("Neo.Runtime.GetTime")
	public native static long time();
}
