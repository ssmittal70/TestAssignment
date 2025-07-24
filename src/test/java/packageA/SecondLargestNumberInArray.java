package packageA;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int num[] = {1,9,5,55,8,-1,3,3,55} ;
		int n = num.length;

		int highest = num[0] ;
		int secondHighest = num[0] ;

		for(int i = 0; i<n ; i++){
		if(num[i] > highest ){
		secondHighest = highest ;
		highest = num[i]  ;
		}
		}
		System.out.println("Second Largest:"+secondHighest);

	}

}
