package com.cmpe275.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

/**
 * @author jaspr
 * GreeterModule extends the AbstractModule provided by Guice and it is
 * used to configure the binding for Greeter interface.
 * The ambiguity is resolved using annotatedWith method, which accepts a 
 * String constant as input and resolve it to the concrete implementation
 * of the Greeter interface i.e CoolGreeter/WarmGreeter.
 */
public class GreeterModule extends AbstractModule{

	@Override
	public void configure() {
		bind(Greeter.class).annotatedWith(Names.named("CoolGreeter")).to(CoolGreeter.class);
		bind(Greeter.class).annotatedWith(Names.named("WarmGreeter")).to(WarmGreeter.class);
	}
}
