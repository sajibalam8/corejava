package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 
		 * LinkedList list = new LinkedList();
		 * 
		 * list.add("111"); list.add("222"); list.add("333");
		 * 
		 * l
		 * 
		 * 
		 * list.addFirst("______"); list.addLast("------"); list.remove(1); for(Object
		 * s:list){ System.out.println(s); }
		 * 
		 * Iterator iterator = list.iterator(); while (iterator.hasNext())
		 * System.out.println(iterator.next());
		 * 
		 * 
		 * System.out.println(list);
		 */

		String[] array = new String[10];
		array[0] = "A";
		array[1] = "B";
		array[2] = "C";
		array[3] = "D";
		array[4] = "E";
		for (int i = 0; i < array.length; i++) {

			System.out.println("Values Before" + array[i]);
		}

		System.out.println("----------------");
		/*
		 * array[1]=array[2];//C array[2]=array[3];//D array[3]=array[4];//E
		 * array[4]=null;
		 * 
		 * 
		 * for ( int i= 1 ; i<= array.length-2; i++) {
		 * 
		 * array[i]=array[i+1];
		 * 
		 * 
		 * }
		 * 
		 * for ( int i= 0 ; i< array.length; i++) {
		 * 
		 * 
		 * System.out.println("Values Values After" +array[i]); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 */

		Set<String> a = new HashSet();
		a.add("111");
		///a.forEach(e -)
		///a.add("111"); a.add("111");
		a.forEach(e -> {System.out.println("e-------------------"+e);});
		System.out.println("a--------------"+a);
		 
		LinkedList list = new LinkedList();
	 list.add("111"); list.add("111"); list.add("111");
			System.out.println("______list"+list);
			
			Map<String,Integer> map = new HashMap();
			map.put("111",111);
			map.put("222",222); map.put("333",333);
			map.remove("222", 222);
			//se
			//System.out.println("map--------------"+map);
		
	}
}