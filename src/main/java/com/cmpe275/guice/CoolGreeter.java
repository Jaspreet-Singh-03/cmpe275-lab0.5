package com.cmpe275.guice;

/**
 * @author jaspr
 *	CoolGreeter is a concrete implementation of Greeter interface
 */
public class CoolGreeter implements Greeter{

	/**
	 * greet method prints the message to the console.
	 */
	@Override
	public void greet() {
		System.out.println("Hey World. Me CoolGreeter");
	}

}
