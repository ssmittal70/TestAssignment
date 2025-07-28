package packageA;

public class MissingNumberInArray {

	public static void main(String[] args) {
		 int a[] = {1,3,4,5} ;
	        int n = a.length + 1 ;   // n value will come 5
	        int sum = (n*(n+1))/2 ;  // sum will come as 15
	        for(int i = 0; i<a.length ; i++){
	            sum = sum - a[i];
	        }
	       System.out.println("Missing number is " +sum ); 
	}

}
