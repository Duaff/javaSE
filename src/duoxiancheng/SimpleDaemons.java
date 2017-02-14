package duoxiancheng;

public class SimpleDaemons implements Runnable{

	public void run() {
		while(true){
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
