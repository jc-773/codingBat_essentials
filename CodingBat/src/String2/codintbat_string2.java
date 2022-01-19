package String2;

public class codintbat_string2 {

	public static void main(String[] args) {
	

	}
	public String doubleChar(String str) {
		  String a = "";
		  for(int i = 0; i < str.length(); i++) {
		    a += str.charAt(i);
		    a += str.charAt(i);
		  }
		  return a;
		}

}
