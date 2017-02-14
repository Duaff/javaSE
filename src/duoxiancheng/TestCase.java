package duoxiancheng;

public class TestCase {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0;i < 10;i++){
			Thread t = new Thread(new SimpleDaemons());
			t.setDaemon(true);
			t.start();
		}
		System.out.println("All dae started");
		Thread.sleep(100);
	}
}
