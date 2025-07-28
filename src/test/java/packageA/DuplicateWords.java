package packageA;

public class DuplicateWords {

	public static void main(String[] args) {
	
		         String arr[] = {"java" , "selenium" , "java" , "Maven" , "selenium" , "java"};
		       
		       for(int i = 0 ; i<arr.length ;i++){
		         int count = 1;
		         if(arr[i] == "0") continue;
		         
		         for(int j =i+1 ; j <arr.length ; j++){
		           if(arr[i].equalsIgnoreCase(arr[j])){
		             count++;
		             arr[j] = "0";
		           } }
		         if(count ==1){
		           System.out.println("Unique string is " +arr[i] );
		          }
		           if(count >1){
		           System.out.println("duplicate string is " +arr[i] + " coming " +count);
		           
		         }  }

	}
}
