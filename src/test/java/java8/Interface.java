package java8;

interface A
{
	void show(int i);
}

public class Interface {

	public static void main(String[] args) {
		
		A obj;
//		 obj = new A() {
//			public void show(int i) {
//			System.out.println("Test");
//			
//			}
//		};
		obj = (int i) -> System.out.println("Test" +i);
		obj.show(6);
		
	}
}
