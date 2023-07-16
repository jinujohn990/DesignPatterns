package com.jinu.designpatterns.singletonpatterns;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton singleton1 =Singleton.getInstance();
		Singleton singleton2 =Singleton.getInstance();
		System.out.println(singleton1.getCounter());
		System.out.println(singleton2.getCounter());
		singleton1.incrementCounter();
		System.out.println(singleton2.getCounter());
		System.out.println("instance1 hashCode: " +singleton1.hashCode());
		System.out.println("instance2 hashCode: " +singleton2.hashCode());
	}

}
