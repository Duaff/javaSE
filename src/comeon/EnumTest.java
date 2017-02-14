package comeon;

public class EnumTest {
	public static void main(String[] args) {
		Dog d = Dog.TOP;
		System.out.println(d);
		for(Dog dog : Dog.values()){
			System.out.println(dog+" ordinal:"+dog.ordinal());
		}
	}
}

enum Dog{
	SMILE,BIG,TOP,KING,QUEUE
}