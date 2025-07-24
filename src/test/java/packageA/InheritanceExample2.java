package packageA;

	class Parent2 {
	    public void test(int index) {
	        System.out.println("Inside Parent class method " + index);
	    }
	}

	class InheritanceExample2 extends Parent2 {

	    public void test(int index) {
	        System.out.println("Inside Child class method " + index);
	    }
	    public static void main(String args[]) {
	    	   Parent2 obj1 = new InheritanceExample2();      // Took Reference of parent class and creating object of child class 
	        obj1.test(10);
	        System.out.println("Inside main method");
	    }
	}
	
//	Inside Child class method 10
//	Inside main method
