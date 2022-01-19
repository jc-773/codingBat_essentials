package String2;

public class codintbat_string2 {

	public static void main(String[] args) {
		System.out.println(xyzMiddle("AAxyzBB"));
	}

	public String doubleChar(String str) {
		String a = "";
		for (int i = 0; i < str.length(); i++) {
			a += str.charAt(i);
			a += str.charAt(i);
		}
		return a;
	}

	public int countHi(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
				count++;
			}
		}
		return count;
	}

	public boolean catDog(String str) {

		int catCount = 0;
		int dogCount = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'a' && str.charAt(i - 1) == 'c' && str.charAt(i + 1) == 't') {
				catCount++;
			}
			if (str.charAt(i) == 'o' && str.charAt(i - 1) == 'd' && str.charAt(i + 1) == 'g') {
				dogCount++;
			}
		}
		return dogCount == catCount;
	}

	public int countCode(String str) {
		String a = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e' && i >= 3) {
				if (str.charAt(i - 3) == 'c' && str.charAt(i - 2) == 'o') {
					count++;
				}
			}
		}
		return count;
	}

	public boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				return true;
			}
		}
		return false;
	}

	public boolean xyBalance(String str) {
		int lastIndexOfX = str.lastIndexOf('x');
		int lastIndexOfY = str.lastIndexOf('y');

		return lastIndexOfX <= lastIndexOfY;
	}

	public String mixString(String a, String b) {
		String combinedString = "";
		int aLength = a.length();
		int bLength = b.length();
		int combinedLength = a.length() + b.length();

		for (int i = 0; i < combinedLength; i++) {
			if (i <= aLength - 1)
				combinedString += a.substring(i, i + 1);
			if (i <= bLength - 1)
				combinedString += b.substring(i, i + 1);
		}

		return combinedString;
	}

	public String repeatEnd(String str, int n) {
		String a = "";

		for (int i = 0; i < n; i++) {
			a += str.substring(str.length() - n, str.length());
		}
		return a;
	}

	public String repeatFront(String str, int n) {
		String a = "";

		for (int i = n; n > 0; n--) {
			a += str.substring(0, n);
		}
		return a;
	}

	public String repeatSeparator(String word, String sep, int count) {
		String b = "";

		for (int i = 0; i < count; i++) {

			b += word + " ";

		}
		String x = b.replaceAll(" ", sep);
		return x.substring(0, x.length() - sep.length());

	}

	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		String newString = str.substring(n, str.length());
		return newString.contains(prefix);
	}

	public static boolean xyzMiddle(String str) {
		if(str.length() < 3) {
			return false;
		}
		
		int stringMinus2 = str.length() / 2 - 2;
		int stringMinus1 = str.length() / 2 -1;
		
		if(str.length() % 2 == 0) {
			return str.substring(stringMinus2, stringMinus2 + 3).equals("xyz") || 
					str.substring(stringMinus1, stringMinus1 + 3).equals("xyz");
		}
		
		return str.substring(stringMinus1, stringMinus1 + 3).equals("xyz");
	}

}
