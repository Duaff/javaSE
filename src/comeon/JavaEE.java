package comeon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


class A{
	String a ="0";
	
}

public class JavaEE {
	//@Test
	public void test1(int a){
//		if(a >= 10)//1234
//			test1(a/10);
//		System.out.println(a%10);
		while(a>=10){//102
			a = a/10;//10
			System.out.println(a%10);//1
		}
		//System.out.println(a);
	}
	//@Test
	public void test2(){
		List<Integer> list = new LinkedList<Integer>();
		list.add(4);list.add(5);list.add(6);
		for(int i = 0;i<4;i++){
			list.add(i);
		}
		System.out.println(list);
	}
	//@Test
	 public int JumpFloor(int target) {
        int n=0;
		for(int i=0;i<=target;i++){
            for(int j=0;j<=target;j++){
                if(i+j==target){
                    	n++;
                	} 
                }
            }
		return n;
    }
	 //@Test
	 public void test3(){
		System.out.println(1%10);
	 }
	 //@Test
		public void test4(){
			test1(102);
		}
	 //int类型的comparable测试
	 //@Test
	 public void test5(){
		 Integer a = 0;
		 Integer b = 1;
		 if(a.compareTo(b)<0){
			 System.out.println("1");
		 }
	 }
	 //@Test
	 public int haha(int x){
		 int[] arr = {3,5,7,8};
		 int start = 0;
		 int end = arr.length-1;
		 int mid = (start+end)/2;
		 while((start<=mid)&&(end>=mid)){
			 if(arr[mid]<x){
				 mid++;
			 }else if(arr[mid]>x){
				 mid--;
			 }else {
				return mid;			}
		 }
		 return -1;
	 }
	 //@Test
	 public void test6(){
		System.out.println(1/2+"d");
	 } 
	 //@Test
	 public void test7(){
		 System.out.println(haha(8));
	 }
	 //@Test
	 public void test8(){
//		 Square s = new Square(4, 3);
//		 Square[] sq = {s};
		 int a =0101;
		 System.out.println(a);
	 }
	 //@Test
	 public void testListGetSpeed(){
		 long l1 = System.currentTimeMillis();
		 List<Integer> list = new LinkedList<Integer>();
		 for(int i = 0;i<100000;i++){
			 list.add(i);
		 }
		 System.out.println(System.currentTimeMillis()-l1);
		 Iterator<Integer> it = list.iterator();
		 l1 = System.currentTimeMillis();
		 while(it.hasNext()){
			 if(it.next()%2==0)
				 it.remove();
		 }
		 System.out.println(System.currentTimeMillis()-l1);
	 }
	 
	 @Test
	 public void Test9(){
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 map.put("1", 1);map.put("2", 2);map.put("3", 3);map.put("4", 4);
		 String str = map.keySet().iterator().next();
		 System.out.println("map"+str);
	 }
}
class Shape<String> implements Comparable<Shape<String>>{
	public int compareTo(Shape<String> o) {
		
		return 0;
	}
	
}
@SuppressWarnings("hiding")
class Square<String> extends Shape{

	
}
