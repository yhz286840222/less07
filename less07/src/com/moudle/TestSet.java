package com.moudle;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

//Set:数据的无序性和不可重复性
//实现类：HashSet(主要实现类)   LinkedHashSet  TreeSet
//无序性：存储的顺序是“无序”的。
//对于要存入Set集合中的自定义类的对象的时候，自定义类必须要重写equals()和hashCode()方法。
public class TestSet {
	//TreeSet中只允许添加同种类型的对象。
	//自然排序：如果存入的对象时自定义类的对象，则一定要自定义类实现Comparable接口，重写compareTo()方法。
	//定制排序：创建一个实现Comparator接口的一个对象，将其作为TreeSet构造器的形参。
	@Test
	public void testTreeSet1(){
		Comparator comparator = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Order && o2 instanceof Order){
					Order order1 = (Order)o1;
					Order order2 = (Order)o2;
					return -order1.orderId.compareTo(order2.orderId);
				}
				return 0;
			}
			
		};
		TreeSet set = new TreeSet(comparator);
		set.add(new Order(1003));
		set.add(new Order(1005));
		set.add(new Order(1001));
		set.add(new Order(1007));
		
		IteratorCollection(set);
		
	}
	
	@Test
	public void testTreeSet(){
		Set set = new TreeSet();
		/*set.add(123);
		set.add(345);
		set.add(33);
		set.add(0);*/
		Customer1 cust1 = new Customer1("aa",1001);
		Customer1 cust2 = new Customer1("mm",1002);
		Customer1 cust3 = new Customer1("dd",1004);
		Customer1 cust4 = new Customer1("gg",1003);
		set.add(cust1);
		set.add(cust2);
		set.add(cust3);
		set.add(cust4);
		IteratorCollection(set);
	}
	
	//LinkedHashSet 根据元素的 hashCode 值来决定元素的存储位置，但它同时使用链表维护元素的次序，
	//这使得元素看起来是以插入顺序保存的。
	@Test
	public void testLinkedHashSet(){
		Set set = new LinkedHashSet();
		set.add(123);
		set.add("atguigu");
		set.add("atguigu");
		//set.add(null);
		set.add(new Customer1("Peter",1001));
		set.add(new Customer1("Lucy",1002));
		set.add(new Customer1("Lucy",1002));
		IteratorCollection(set);
	}
	
	@Test
	public void testHashSet(){
		Set set = new HashSet();
		set.add(123);
		set.add("atguigu");
		set.add("atguigu");
		//set.add(null);
		set.add(new Customer1("Peter",1001));
		set.add(new Customer1("Lucy",1002));
		set.add(new Customer1("Lucy",1002));
		System.out.println(set.size());
		IteratorCollection(set);
	}
	
	//遍历
		public static void IteratorCollection(Collection coll){
			Iterator iterator = coll.iterator();
			while(iterator.hasNext()){
				Object obj = iterator.next();
				System.out.println(obj + "hashCode:" + obj.hashCode());
			}
		}
}
