public class LCD {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		printLCD(a, b);
	}

	static void printLCD(int m, int n) {
		if (m <= 0 || n <= 0) {
			System.out.println("only positive number allowed");
		} else {
			System.out.println("LCD(" + m + ", " + n + ") = " + recGGT(m, n));
		}
	}

	static int recLCD(int m, int n) {
		int r = m-n;
		
		if (m < n) return recLCD(n, m);
		return (r == 0) ? m : recLCD(n, r);
	}

}