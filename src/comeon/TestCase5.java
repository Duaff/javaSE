package comeon;

import org.junit.Test;

public class TestCase5 {
	@Test
	public void testTuple(){
		TwoTuple<String, Integer> tt = new TwoTuple<String, Integer>("hi", 17);
		System.out.println(tt.toString());
	}
}
class TwoTuple<A,B>{
	public final A first;
	public final B second;
	public TwoTuple(A first, B second) {
		this.first = first;
		this.second = second;
	}
	@Override
	public String toString() {
		return "TwoTuple [first=" + first + ", second=" + second + "]";
	}
	
}