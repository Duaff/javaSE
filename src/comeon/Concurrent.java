package comeon;

public class Concurrent {
	public static void main(String[] args) {
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		f1.setName("lili");
		f1.start();
		f1.setName("tom");
		f2.start();
		System.out.println("--start");
	}
}
class Foo extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+i);
			Thread.yield();
		}
	}
}