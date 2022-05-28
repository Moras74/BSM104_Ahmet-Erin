class insertionSort {
void insertionsort(int[] array) {
	for(int i = 1; i< array.length; i++) {
		int key = array[i];
		int j = i-1;
		while(j>=0 && array[j] > key) {
			array[j+1] = array[j];
			j--;
		}
		array[j+1] = key;
	}}
	void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = {9,27,6,15,7,5,1,11};
		insertionSort ob = new insertionSort();
		ob.insertionsort(array);
		ob.printArray(array);
	}

}
