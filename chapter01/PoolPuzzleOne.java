class PoolPuzzleOne {
	public static void main(String[] args) {
		int x = 0;
		
		while (x < 4) { // 1
			System.out.print("a"); // 2

			if(x < 1) {
				System.out.print(" "); // 3
			}
			System.out.print("n");// 4
			if(x > 1) { // 5
				System.out.print(" oyster");// 6
				x = x + 2; // 7
			}
			if(x == 1) {
				System.out.print("noys"); // 8
			}
			if(x < 1) { // 9
				System.out.print("oise");// 10
			}
			System.out.println("");
			x = x + 1; // 11

		}
	}
}
