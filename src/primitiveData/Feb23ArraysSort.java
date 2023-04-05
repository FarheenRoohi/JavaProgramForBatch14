package primitiveData;

public class Feb23ArraysSort {

	public static void main(String[] args) {
		int a[] = new int[] { 3, 7, 9, 7, 2, 10, 43, 78 };
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {

				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int x : a) {
			System.out.println(x);
		}

	}

}
