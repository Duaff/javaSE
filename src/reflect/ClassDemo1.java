package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		ClassUtil.printConMessage(new Integer(1));
//		ClassUtil.printConMessage("hah");
		Constructor con = String.class.getConstructor(String.class);
		String a = (String) con.newInstance("a");
		System.out.println(a);
		Class c = Wri.class;
		Wri w = (Wri) c.newInstance();
		System.out.println(w.a);
	}
}
class Wri{
	public int a;
	public Wri() {
	}
	
}
