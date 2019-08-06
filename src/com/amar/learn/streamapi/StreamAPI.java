package com.amar.learn.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	static List<StudentBean> students = new ArrayList<>();
	static List<Integer> list = new ArrayList<>();
	
	static {
		
		students.add(new StudentBean("Amar", 26, 91));
		students.add(new StudentBean("Piyu", 24, 95));
		students.add(new StudentBean("Priyanka", 25, 96));
		students.add(new StudentBean("Avni", 27, 93));
		students.add(new StudentBean("Rastogi", 26, 99));
		list.add(10);
		list.add(90);
		list.add(23);
		list.add(12);
	}
	
	public static Boolean ageFilter(StudentBean s) {
		if (s.getAge() > 25)
			return true;
		else
			return false;
	}
	
	public static int ageReverseSort(StudentBean s1, StudentBean s2) {
		if (s1.getAge() < s2.getAge())
			return 1;
		if (s1.getAge() > s2.getAge())
			return -1;
		else {
			if (s1.getName().compareTo(s2.getName()) > 0)
				return 1;
			if (s1.getName().compareTo(s2.getName()) < 0)
				return -1;
			else
				return 0;
		}
			
		
	}
	public static void main(String[] args) {
		
		//List<StudentBean> newStudents = students.stream().filter(StreamAPI::ageFilter).collect(Collectors.toList());
		//System.out.println(list);
		//System.out.println(newStudents);
		List<StudentBean> newList = students.stream().sorted().collect(Collectors.toList());
		List<Integer> intList = list.stream().sorted().collect(Collectors.toList());		
		List<StudentBean> listCustomSort = students.stream().sorted(StreamAPI::ageReverseSort).collect(Collectors.toList());
 		//System.out.println(newList);
		//System.out.println(intList);
		//System.out.println(listCustomSort);
		listCustomSort.stream().forEach(s -> System.out.println(s));
	}
}
