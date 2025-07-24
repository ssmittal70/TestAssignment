package packageA;

public class StrinngReverseOddPlaces {

	public static void main(String[] args) {
		  String str = "Java is  programming language to learn" ;  // two spaces here after is
	        String[] a = str.split("\\s+");  // This s+ handles one or more spaces:
	        String word = "";
	       for(int i = 0 ; i< a.length ; i++){
	         String s = "";
	         String c = "";
	         
	       if(i% 2 == 0){
	         StringBuffer sb = new StringBuffer(a[i]);
	          s = sb.reverse().toString();
	         word = word + s + " ";
	       }
	       else{
	         c = a[i];
	         word = word + c + " ";
	       }  }
	       System.out.println(word.trim());

	}

}
