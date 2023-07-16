package com.jinu.designpatterns.singletonpatterns;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = 1L;
	private long counter;
	private static Singleton singleton;
	static {
		singleton = new Singleton();
	}

	private Singleton() {
		counter = 1;
	}

	public static Singleton getInstance() {
		return singleton;

	}

	protected Object readResolve() {
		return singleton;
	}

	public long getCounter() {
		return counter;
	}

	public void incrementCounter() {
		this.counter += 1;
	}
}
