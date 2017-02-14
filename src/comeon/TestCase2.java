package comeon;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestCase2 {
	@Test
	public void test1(){
		List<? extends Fruit> list = new ArrayList<Apple>();
	}
	
}
class Fruit{}
class Apple extends Fruit{}
class Jon extends Apple{}
class Orange extends Fruit{}
