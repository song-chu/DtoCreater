import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {

			String buf = in.nextLine();
			String[] arr = buf.split(" ");

			if (arr.length < 3) {
				continue;
			}

			int size1 = Integer.parseInt(arr[0]);
			int size2 = Integer.parseInt(arr[1]);
			int size3 = Integer.parseInt(arr[2]);

			System.out.println(isRightTriangle(size1, size2, size3) ? "YES" : "NO");
		}
	}

	static boolean isRightTriangle(int... nums) {

		sort(nums);

		int max = nums[0] * nums[0];
		int other1 = nums[1] * nums[1];
		int other2 = nums[2] * nums[2];

		return (max == (other1 + other2));
	}

	static void sort(int... nums) {
		int temp = 0;
		int j;
		for (int i = 1; i < nums.length; i++) {

			j = i;

			while (j > 0 && (nums[j - 1] < nums[j])) {

				temp = nums[j - 1];
				nums[j - 1] = nums[j];
				nums[j] = temp;

				j--;
			}
		}
	}
}