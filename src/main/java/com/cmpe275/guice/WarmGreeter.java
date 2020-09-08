package com.cmpe275.guice;
/**
 * @author jaspr
 *	WarmGreeter is a concrete implementation of Greeter interface
 */
public class WarmGreeter implements Greeter {
	
	/**
	 * greet method prints the message to the console.
	 */
	@Override
	public void greet() {
		System.out.println("Hello, my dear World. I am WarmGreeter. Nice to see you!");
	}
}
