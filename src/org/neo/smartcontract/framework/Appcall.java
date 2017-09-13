package org.neo.smartcontract.framework;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
public @interface Appcall {
	public String value();
}
