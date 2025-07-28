package packageA;

public class FindMinMaxInArray {

	public static void main(String[] args) {
		  int a[] ={6,2,3,4,5,7,10,-2};
	        int min = a[0];
	        int max = a[0];
	        
	        for(int i = 0 ; i<a.length; i++){
	          if(min > a[i] ){
	            min = a[i];
	          }
	           if(max < a[i]){
	             max = a[i];
	           } }
	            System.out.println("Min Value " +min +" " +"Max Value " +max); 

	}

}
