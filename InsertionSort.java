public class InsertionSort {

	private int[] array;
	private int[] tempIArr;

	public InsertionSort(int[] array) {
		this.array = array;

	}

	public int[] sort() {
		int length;
		length = array.length;
		this.tempIArr = new int[length];
		doInsertionSort(array);
		return array;
	}

	private void doInsertionSort(int[] array) {
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}
}
