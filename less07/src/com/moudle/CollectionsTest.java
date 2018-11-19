package com.moudle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(15);
		list.add(6);
		list.add(23);
		list.add(89);
		list.add(6);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}		
		System.out.println("反转集合---------------------");
		//反转集合
		Collections.reverse(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("随机顺序---------------------");
		//使集合元素随机顺序
		Collections.shuffle(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("升序排序---------------------");
		//排序默认升序
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("Comparator自定义---------------------");
		Comparator<Integer> comp=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1<o2)
					return 1;
				if(o1>o2)
					return -1;
				if(o1==o2)
					return 0;
				return -1;
			}
		};
		//根据Comparator指定方式查找最大
		Integer m=Collections.max(list, comp);
		System.out.println(m);
		System.out.println("Comparator排序---------------------");
		//根据Comparator排序
		Collections.sort(list, comp);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("调换元素位置---------------------");
		//跟换集合指定两个下标的元素
		Collections.swap(list, 0, 4);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("查询出现次数---------------------");
		int frequency=Collections.frequency(list, 6);
		System.out.println(frequency);
		System.out.println("复制集合参数2复制到参数1中---------------------");
		List<Integer> l=new ArrayList<>(6);		
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(11);
		l.add(12);
		l.set(5, 1);//设置值
		l.add(13);
		l.add(14);
		Collections.copy(l, list);
		for (Integer integer : l) {
			System.out.println(integer);
		}
		
		System.out.println("使用新值替换所有旧值---------------------");
		//使用新值替换所有旧值
		Collections.replaceAll(list, 6, 11);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
