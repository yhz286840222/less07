package com.moudle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		//add()
		list.add("atguigu");
		list.add(123);
		list.add(new Date());
		list.add(1, 234);
		//get(int index)
		System.out.println(list.get(0));
		
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//remove(int index)
		//remove(Object obj)
		list.remove(new String("atguigu"));
		System.out.println(list.size());
		//set
		list.set(0, "abcd");
		System.out.println(list.get(0));
		
		IteratorList(list);
		//保证通过ArrayList创建的对象的线程安全
		list = Collections.synchronizedList(list);
	}
	//遍历
	public static void IteratorList(Collection coll){
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
}
