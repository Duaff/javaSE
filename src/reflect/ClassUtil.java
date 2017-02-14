package reflect;

import java.lang.reflect.Constructor;

public class ClassUtil {
	/**
	 * 打印印象的构造方法信息
	 */
	public static void printConMessage(Object obj){
		System.out.println("类的名称："+obj.getClass().getName());
		Constructor [] con = obj.getClass().getConstructors();
		for (Constructor constructor : con) {
			System.out.println("构造器名称："+constructor.getName());
			Class[] paramType = constructor.getParameterTypes();
			for (Class class1 : paramType) {
				System.out.println("构造器入参："+class1.getName());
			}
		}
	}
}
