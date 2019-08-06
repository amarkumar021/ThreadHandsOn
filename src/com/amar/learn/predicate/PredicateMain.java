package com.amar.learn.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		
	/*	Predicate<Collection> p = n -> (n.isEmpty());
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		System.out.println(p.test(l));*/
		
		/*int[] arr = {2, 14, 9, 15, 4, 5, 7, 8, 112, 90};
		
		Predicate<Integer> pGreterThanTen = n -> (n > 10);
		Predicate<Integer> pEvenNumber = n -> (n%2 == 0);
		Predicate<Integer> pLessThanHundred = n -> (n < 100);
 		
		System.out.println("Numbers Greater than 10: ");
		predicateResolver(pGreterThanTen.and(pEvenNumber).and(pLessThanHundred), arr);*/
		
		
		/*String[] nameArray = { "Amar", "Priyanka", "PU", "Piyu", "Avni"};
		Predicate<String> nameStartsWithP = name -> name.charAt(0) == 'P';
		
		for (String name : nameArray) {
			System.out.println(name + " : " + nameStartsWithP.test(name));
		}*/
		
		List<String> l = new ArrayList<>();
		l.add("Amar");
		l.add("Priyanka");
		l.add("Rastogi");
		l.add("Avni");
		
		Predicate<String> namesOnlyAmarPiyu = name -> name.isEmpty() || name.equals("Amar") || name.equals("Priyanka");
		
		for (String name: l) {
			
			System.out.println(namesOnlyAmarPiyu.test(name));
		}
	}
	
	static void predicateResolver(Predicate<Integer> p, int[] numArray) {
		for (int num: numArray) {
			System.out.println("number: " + num + "  " + p.test(num));
		}
	}

}
