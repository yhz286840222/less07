package com.moudle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestMap {
	@Test
	public void testHashMap(){
		Map map = new HashMap();
		map.put("1", new Customer1("aa",1001));
		map.put("2", new Customer1("bb",1002));
		map.put("3", new Customer1("cc",1003));
		map.put("4", new Customer1("dd",1004));
		System.out.println(map.size());
		
		/*
		 *  Set keySet():
			Collection values()
			Set entrySet()
		 */
		//遍历key集中的元素
		Set set = map.keySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("$$$$$");
		//遍历vaule集
		Collection coll = map.values();
		iterator = coll.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("$$$$$");
		//实现key-value对的遍历(法一）
		Set set1 = map.keySet();
		iterator = set1.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj + "---->" + map.get(obj));
		}
		
		//实现key-value对的遍历(法二）
		Set set2 = map.entrySet();
		for(Object obj :set2){
			Map.Entry entry = (Map.Entry)obj;
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}
}
