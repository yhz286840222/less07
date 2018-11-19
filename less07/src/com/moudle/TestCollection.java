package com.moudle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/*
 * 数据存储：
 * 1.数组Array：
 *    int[] i = new int[10];
 *    String[] str = new String{"1","2","abc"};
 * 优点：速度快，效率高
 * 缺点：①对长度是固定的，不可以动态的存储数据。②不能方便的获取数组中真正存储数据的个数。
 * 
 * 2.集合类：Collection和Map
 * 	   Set:无序的，同时是不可重复的（高中的集合概念。）
 * 	   List:有序的，且可以重复。（动态数组）
 * Map：key-value。（函数的概念）  y = f(x)
 */
public class TestCollection {
	@Test
	public void testList(){
		List list = new ArrayList();
	}
	@Test
	public void testCollection(){
		Collection coll = new ArrayList();
		//1.boolean add(Object obj)  
		coll.add(new Integer(123));
		coll.add(new String("atguigu"));
		coll.add(new Customer(1001,"张龙"));
		//int size()  
		System.out.println(coll.size());
		//boolean addAll(Collection c) 
		Collection col = Arrays.asList(1,2,3,4,5);
		coll.addAll(col);
		System.out.println(coll.size());
		//void clear()  
		//boolean isEmpty() 
		//coll.clear();
		//System.out.println(coll.isEmpty());
		//boolean contains(Object o) 
		System.out.println("1." + coll.contains(new String("atguigu")));
		System.out.println("2." + coll.contains(new Customer(1001,"张龙")));
		//boolean equals(Object o) 
		coll = new ArrayList();
		coll.add(1);
		coll.add(2);
		coll.add(3);
		Collection coll1 = Arrays.asList(1,2,3);
		System.out.println("3" + coll.equals(coll1));
		//boolean remove(Object o) 
		 coll.remove(2);
		 System.out.println("4  "+coll.size());
		 System.out.println();
		 //使用迭代器遍历集合元素：Iterator iterator() 
		 Iterator iterator = coll1.iterator();
		 while(iterator.hasNext()){
			 System.out.println(iterator.next());
		 }
		 System.out.println();
		 //使用增强的for循环
		 for(Object o : coll1){
			 System.out.println(o);
		 }
		 //Object[] toArray();
		 Object[] ob = coll1.toArray();
		 System.out.println(ob.length);
	}
	@Test
	public void testForeach(){
		String[] str = new String[5];
		for(String myStr : str){
			myStr = "atguigu";
			System.out.println(myStr);
		}
		for(int i = 0;i < str.length;i++){
			System.out.println(str[i]);
		}
		
	}
}
class Customer{
	int customerId;
	String customerName;
	public Customer(int id,String name){
		this.customerId = id;
		this.customerName = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	
	
	
}
