package reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {
	public static void main(String[] args) {
		A a = new A();
		Class c1 = a.getClass();
		try {
			//Method ms = c1.getMethod("print", int.class,int.class);
			Method ms = c1.getMethod("print", new Class[]{int.class,int.class});
			Object o = ms.invoke(a, 10,20);
			System.out.println(o);
			System.out.println("-------------------------------");
			Method ms2 = c1.getMethod("print", String.class,String.class);
			Object o2 = ms2.invoke(a, "fdf","dffDFFD");
			Method ms3 = c1.getMethod("print");
			ms3.invoke(a);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class A{
	public void print(){}
	
	public int print(int a,int b){
		return a+b;
	}
	
	public void print(String a,String b){
		System.out.println(a.toUpperCase()+b.toLowerCase());
	}
}
