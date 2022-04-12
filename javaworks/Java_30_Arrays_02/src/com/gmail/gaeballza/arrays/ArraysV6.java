package com.gmail.gaeballza.arrays;

public class ArraysV6 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println("=====================================");
		System.out.println("Â¦¼ö ¸®½ºÆ®");
		System.out.println("-------------------------------------");

		int EvenNums = 0;

		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = intNums[i] % 2 == 0;

			if (bEven) {
				System.out.print(intNums[i] + ",\t");

				EvenNums++;

				if (EvenNums % 5 == 0) {
					System.out.println();

				} // if end
			} // if(bEven)end
		} // for end

		System.out.println("=====================================");
	}// main end

}
