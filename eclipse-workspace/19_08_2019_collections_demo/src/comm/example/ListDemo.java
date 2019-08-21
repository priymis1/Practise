package comm.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
		
		/*
		Collection<String> list = new ArrayList<String>();
		list.add("John");
		list.add("John");
		Set<String> set = new HashSet<String>();
		list.addAll(set);
		System.out.println(list);
		list.removeAll(set);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list);
		for(String str:list)
		{
			
		}
		Iterator<String> str=list.iterator();
		while(str.hasNext())
		{
			list.remove(str.next());
		}
		*/
		
		MapDemo demo = new MapDemo();
		demo.createMap();
		Set<String> set = demo.getMapKeys();
		for(String s:set)
		{
			System.out.println(s);
		}
		Collection<String> str=demo.getMapValues();
		Object[] s=str.toArray();
	}
}
