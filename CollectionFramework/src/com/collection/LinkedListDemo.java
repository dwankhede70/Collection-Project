package com.collection;

import java.util.LinkedList;
import java.util.*;
public class LinkedListDemo {
public static void main(String[] args) {
	
	
	LinkedList l=new LinkedList();
	l.add("Dnyanesh");
	l.add(9);
	l.add("Wankhede");
	l.add("Dnyanesh");
	l.add(null);
	System.out.println(l);
	
	l.set(0, "Software");
	l.add(0,"Venky");
	l.removeLast();
	l.addFirst("CCC");
	
	System.out.println(l);
	
	
	
}
}
