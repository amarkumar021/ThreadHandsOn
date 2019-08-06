package com.amar.learn.generics;

public class GenericMsgPrint<T, U> {
	
	T obj1;
	U obj2;
	GenericMsgPrint(T t, U u){
		this.obj1 = t;
		this.obj2 = u;
	}
	
	public void print() {
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
