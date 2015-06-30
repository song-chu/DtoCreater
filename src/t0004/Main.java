package t0004;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {

			String buf = in.nextLine();
			String[] arr = buf.split(" ");

			if (arr.length < 6) {
				continue;
			}

			double a = Double.parseDouble(arr[0]);
			double b = Double.parseDouble(arr[1]);
			double c = Double.parseDouble(arr[2]);
			double d = Double.parseDouble(arr[3]);
			double e = Double.parseDouble(arr[4]);
			double f = Double.parseDouble(arr[5]);

			double y = getY(a, b, c, d, e, f);

			double x = getX(a, b, c, y);

			BigDecimal bdx = new BigDecimal(x);
			bdx.setScale(3, RoundingMode.HALF_UP);

			BigDecimal bdy = new BigDecimal(y);
			bdy.setScale(3, RoundingMode.HALF_UP);

			System.out.printf("%.3f %.3f", bdx, bdy);

		}
	}

	//(a * x) + (b * y) = c;
	//(d * x) + (e * y) = f;
	static double getY(double a, double b, double c, double d, double e, double f) {

		double y = (f - d * c) * (a / (a * e - d * b));
		return y;
	}

	//(a * x) + (b * y) = c;
	//(d * x) + (e * y) = f;
	static double getX(double a, double b, double c, double y) {

		double x = (-1 * (b / a)) * y + c;
		return x;
	}
}