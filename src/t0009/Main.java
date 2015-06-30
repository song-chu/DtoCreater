package t0009;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		List<Integer> primeNumberList = new ArrayList<Integer>(100000);

		long before = System.currentTimeMillis();

		if (in.hasNext()) {

			String line = in.nextLine();
			int num = Integer.parseInt(line);

			for (int i = 2; i <= num; i++) {

				boolean isPrime = true;

				for (int k = 0; k < primeNumberList.size(); k++) {
					int mod = num % primeNumberList.get(k);

					if (mod == 0) {
						isPrime = false;
						System.out.println(i + "=false");
						break;
					}
				}

				if (!isPrime) {
					continue;
				}

				System.out.println(i + "=true");
				primeNumberList.add(i);
			}

			System.out.println(primeNumberList.size());

		}
		long after = System.currentTimeMillis();

		System.out.println("elapsed time(ms) = " + (after - before));
	}
}