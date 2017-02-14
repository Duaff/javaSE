package duoxiancheng;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskResult implements Callable<String> {
	private int id;
	public TaskResult(int id){
		this.id = id;
	}
	public String call() throws Exception {
		return "result of Task" + id;
	}
	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		ArrayList<Future<String>> list = new ArrayList<Future<String>>();
		for(int i = 0;i < 10;i++)
			list.add(ex.submit(new TaskResult(i)));
		for (Future<String> fu: list) {
			try {
				System.out.println(fu.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				ex.shutdown();
			}
		}
	}
}
