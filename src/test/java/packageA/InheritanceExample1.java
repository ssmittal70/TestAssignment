package packageA;

	class Parent {
	    public int index = 1;

	    public void test(int index) {
	        System.out.println("Inside Parent class method " + index);
	    }
	}

	class InheritanceExample1 extends Parent {

	    public void test(int index) {
	        System.out.println("Inside Child class method " + index);
	    }

	    public static void main(String args[]) {
	        Parent obj1 = new Parent();      // Took Reference of parent class and creating object of parent class 
	        obj1.test(10);
	        System.out.println("Inside main method");
	    }
	}
	
	// Inside Parent class method 10
	// Inside main method
