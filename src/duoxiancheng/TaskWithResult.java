package duoxiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskWithResult implements Callable<String>{

	public String call() throws Exception {
		return "call me";
	}
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			System.out.println(es.submit(new TaskWithResult()));
		}
	}
}
