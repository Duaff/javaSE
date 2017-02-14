package duoxiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOffXiancheng implements Runnable{
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOffXiancheng(){}
	public LiftOffXiancheng(int countDown){
		this.countDown = countDown;
	}
	public String status(){
		return "#" + id +"(" + (countDown > 0 ? countDown : "Liftoff!") +")";
	}
	public void run() {
		while (countDown -- > 0) {
			System.out.println(status());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
//		LiftOffXiancheng lx = new LiftOffXiancheng(15);
//		lx.run();
		
//		Thread t = new Thread(new LiftOffXiancheng());
//		t.start();
//		System.out.println("Waiting....");
		
//		for(int i = 0;i < 5;i++){
//			new Thread(new LiftOffXiancheng()).start();
//		}
		
//		ExecutorService exse = Executors.newCachedThreadPool();
//		for(int i = 0;i < 5;i++)
//			exse.execute(new LiftOffXiancheng());
//		exse.shutdown();
		
//		System.out.println("Waiting...");
		
//		ExecutorService exse = Executors.newFixedThreadPool(5);
//		for(int i = 0;i < 5;i++)
//			exse.execute(new LiftOffXiancheng());
//		exse.shutdown();
		
		ExecutorService exse = Executors.newSingleThreadExecutor();
		for(int i = 0;i < 5;i++)
			exse.execute(new LiftOffXiancheng());
		exse.shutdown();
		System.out.println("Waiting...");
	}
}
class Two{
	
}
