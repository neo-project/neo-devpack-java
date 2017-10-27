package org.neo.smartcontract.framework;

import java.lang.annotation.*;
import org.neo.smartcontract.framework.services.neo.*;

@Target(ElementType.METHOD)
public @interface EntryPoint {
	TriggerType value();
}
