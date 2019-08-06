package com.amar.learn.generics;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		GenericMsgPrint<String,Integer> msg = new GenericMsgPrint<>("Priyanka", 1);
		msg.print();
		
		List<String> l = new ArrayList<>();
		l.add("Honey");
		l.add("Sweet");
		
		GenericMethodPrint obj = new GenericMethodPrint();
		obj.display(l);
	}

}
