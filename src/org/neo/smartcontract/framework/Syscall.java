package org.neo.smartcontract.framework;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
public @interface Syscall {
	public String value();
}
