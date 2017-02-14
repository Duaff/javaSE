package comeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestCase3 {

	public void testInstanceof(Object o){
		if(o instanceof String){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	//@Test
	public void test1(){
		Case1 c = new Case1();
		System.out.println(c.a);
		Case2 c2 = new Case2();
//		System.out.println(c2 instanceof Case1);
		testInstanceof(c2);
		Object o = new Object();
		testInstanceof(o);
		testInstanceof("a");
		System.out.println(c2.a);
		Case3 c3 = new Case3();
		System.out.println(c.equals(0.0));
	}
	//@Test
	public void test2(){
		ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(2, 1));
		ArrayList<Integer> l2 = new ArrayList<Integer>(list);
		for (Integer i : l2) {
			System.out.println(i);
		}
		Collections.fill(l2, 2);
		for (Integer i : l2) {
			System.out.println(i);
		}
	}
	//@Test
	public void test3(){
//		Set<Integer> set = new HashSet<Integer>();
//		set.add(1);set.add(3);set.add(5);set.add(4);set.add(6);
//		for (Integer i : set) {
//			System.err.println(i);
//		}
//		Set<Integer> set2 = new LinkedHashSet<Integer>();
//		set2.add(1);set2.add(3);set2.add(5);set2.add(4);set2.add(6);
//		for (Integer i : set2) {
//			System.out.println(i);
//		}
//		Map<String, Integer> map = new HashMap<String,
//				Integer>();
//		map.put("Sam", 1);map.put("Duff", 2);map.put("Puk", 3);
//		Collection<Integer> col = map.values();
//		for (Integer i : col) {
//			System.out.println(i);
//		}
//		System.out.println(map);
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(0, "Sam");map2.put(1, "Duff");map2.put(2, "Puk");
		System.out.println(map2);
		map2.get(1);
		map2.get(0);
		System.out.println(map2);
	}
	//@Test
	public void test4(){
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.put("a", "1"));
		System.out.println(map.put("a", "2"));
		List<Integer> list = new ArrayList<Integer>();
		if(list != null){
			System.out.println(false);
		}
	}
	//@Test
	public void test5(){
		Integer a = 10000;
		Integer b = 10000;
		System.out.println(a == b);
	}
	@Test
	public void test6(){
		System.out.println(1.42-0.39);
	}
}


class Case1{
	public Integer a;
	public double d = 0d;
	public String toIng(){
		return a.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		long temp;
		temp = Double.doubleToLongBits(d);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Case1 other = (Case1) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
			return false;
		return true;
	}
	
}
class Case2 extends Case1{
	public int b;
}
class Case3 extends Case2{
	public int c;
}