package comeon;

public class Reflection {
	public static void main(String[] args) {
		Class c1 = Foo.class;
		Foo foo = new Foo();
		Class c2 = foo.getClass();
		System.out.println(c1==c2);
		Class c3 = null;
		try {
			c3 = Class.forName("comeon.Foo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		try {
			Foo f1 = (Foo) c1.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Dafu{
	void print(){
		System.out.println("dafu");
	}
}