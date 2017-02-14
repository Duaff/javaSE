package reflect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class MethodDemo2 {
	public static void main(String[] args) {
		UserService us = new UserService();
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入命令");
			String action = reader.readLine();
			/*if("delete".equals(action)){
				us.delete();
			}
			if("update".equals(action)){
				us.update();
			}
			if("find".equals(action)){
				us.find();
			}*/
			Class c = us.getClass();
			Method method = c.getMethod(action);
			method.invoke(us);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
