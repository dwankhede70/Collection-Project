package com.collection;
import java.io.Serializable;
import java.util.*;
public class ArrayList1 {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	LinkedList l2=new LinkedList();
	
	System.out.println(l1 instanceof Serializable);
	System.out.println(l1 instanceof Cloneable);
	System.out.println(l1 instanceof RandomAccess);
	System.out.println(l2 instanceof RandomAccess);
}
}
