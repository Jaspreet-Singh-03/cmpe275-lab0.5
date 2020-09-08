package com.cmpe275.guice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

/**
 * Guice Hello world!
 * App is the entry point of the application, the app class 
 * contains two member variables coolGreeter and warmGreeter
 * and their dependencies are injected by Guice
 */
public class App 
{
	private static final String COOL = "CoolGreeter";
	private static final String WARM = "WarmGreeter";
	
	/**
	 * Inject Annotation is used to inject the dependencies for
	 * the class members, as both the members are of the type Greeter 
	 * the ambiguity is resolved using Named annotation to differentiate 
	 * them and GreeterModule binds them to their concrete classes.
	 */
	@Inject
	@Named(COOL)
	private Greeter coolGreeter;

	@Inject
	@Named(WARM)
	private Greeter warmGreeter;
	
	/**
	 * An instance of injector is created using the Guice libraries
	 * and passing in the Module with binding configuration as an param.
	 * app is an instance of the App class, the injector is used to inject
	 * the member dependencies annotated with Inject.  
	 */
    public static void main( String[] args )
    {	
    	App app = new App();
        Injector injector = Guice.createInjector(new GreeterModule());
        injector.injectMembers(app);
        app.coolGreeter.greet();
        app.warmGreeter.greet();
    }
}
