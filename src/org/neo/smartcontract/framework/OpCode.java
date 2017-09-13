package org.neo.smartcontract.framework;

import java.lang.annotation.*;
import org.neo.vm._OpCode;

@Target(ElementType.METHOD)
public @interface OpCode {
	public _OpCode value();
}
