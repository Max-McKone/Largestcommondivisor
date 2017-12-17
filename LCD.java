public class LCD {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
//input of the two integers a and b
		printLCD(a, b);
	}

	static void printLCD(int m, int n) {
		if (m <= 0 || n <= 0) {
			System.out.println("only positive number allowed");
			//output error
		} else {
			System.out.println("LCD(" + m + ", " + n + ") = " + recLCD(m, n));
			//output result a|b
		}
	}

	static int recLCD(int m, int n) {
		int r = m-n;
		
		if (m < n) return recLCD(n, m);
		return (r == 0) ? m : recLCD(n, r);
	}

}
