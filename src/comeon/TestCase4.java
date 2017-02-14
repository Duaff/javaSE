package comeon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TestCase4 {
	Double a = 1.42;
	Double b = 0.39;
	String astr = a.toString();
	String bstr = b.toString();
	BigDecimal bd = new BigDecimal(astr);
	BigDecimal bd2 = new BigDecimal(bstr);
	//@Test
	public void test1(){
		System.out.println(bd.subtract(bd2));
	}
	@Test
	public void test2(){
		String str = "123,35,344,";
		int index = 0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == ','){
				index = i;
//				System.out.println(i);
				System.out.println(str.substring(i + 1, str.length()-1));
			}
		}
//		System.out.println(index);
	}
	@Test
	public void test3(){
		List<String> list = new ArrayList<String>();
		Iterator<String> it = list.iterator();
		list.add("a");
		try {
			String a = it.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
