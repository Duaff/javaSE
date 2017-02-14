package comeon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;

import org.junit.Test;

public class TestCase1 {

	//@Test
	public void testFile() throws IOException{
		File file = new File("WebRoot"+"dafu");
		if(!file.exists()){
			file.mkdir();
		}
		File file2 = new File(file,"dafu.txt");
		if(!file2.exists()){
			file2.createNewFile();
		}
	}
	//@Test
	public void test1(){
		Integer[] a = {32,8};
		Integer t = a[1];
		int i;
		for(i = 1;i>0;i--){
			a[i] = a[i-1];
			System.out.println(a[i]+","+a[i-1]);
		}
		a[i] = t;
		System.out.println(a[i]);
		System.out.println(Arrays.toString(a));
	}
	//@Test
	public void test2(){
		System.out.println(1/2);
	}
	//@Test
	public void test3(){
		String str = "哈哈";
		byte[] b = str.getBytes();
		System.out.println(Arrays.toString(b));
	}
	//@Test
	public void test4(){
		Queue<Integer> queue = new LinkedList<Integer>();
		PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.offer(i);
			queue2.offer(i);
		}
		System.out.println(queue);
		System.out.println(queue2);
	}
	//@Test
	public void test5(){
		List<Integer> ints = Arrays.asList(1,2,3,4);
		List<Integer> list = new ArrayList<Integer>(ints);
		String str = "I FOUND MY WAY";
		String[] strs1 = str.split("");
		String[] strs2 = {"I","F","D","D","E","E"};
		System.out.println(Arrays.toString(strs1)+"2"+Arrays.toString(strs2));
		List<String> strs = Arrays.asList(str.split(""));
		PriorityQueue<String> queue = new PriorityQueue<String>(strs.size(),Collections.reverseOrder());
		queue.addAll(strs);
		System.out.println(list);
		System.out.println(queue);
	}
	//@Test
	public void test6(){
		try {
			Class up = Class.forName("comeon.Aoo");
			System.out.println(up);
			System.out.println(up.getName());
			Class a = up.getSuperclass();
			try {
				Boo b = (Boo) a.newInstance();
				System.out.println(b.getClass());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Can't find Aoo");
		}
		
	}
	@Test 
	public void test7(){
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
	}
}
class Aoo extends Boo{

}
class Boo{
	
}
