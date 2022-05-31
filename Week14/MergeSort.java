public class MergeSort {
void sort(int[] array,int left,int right) {
	if(left<right) {
		int middle = left + (right - left) / 2;
		sort(array,left,middle);
		sort(array , middle + 1 , right);
		merge(array , left , middle , right);
	}
}
void merge(int[] array , int left , int middle , int right) {
	int number1 = middle - left + 1;
	int number2 = right - middle;
	
	int[] L = new int[number1];
	int[] R = new int[number2];
	
	for (int i = 0; i < number1; i++) {
		L[i] = array[left + i];
	}
	for (int i = 0; i<number2; i++) {
		R[i] = array[middle + 1 + i];
	}
	int i = 0, j = 0;
	int k = left ;
	while ( i < number1 && j < number2) {
		if (L[i] <= R[j]) {
			array[k] = L[i];
			i++;
		} else {
			array[k] = R[j];
			j++;
		}
	}
}
}
