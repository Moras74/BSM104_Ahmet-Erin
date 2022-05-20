
public class BinarySearch {
public static void main(String[] args) {
	int [] numbers= {63,18,51,37,29,49,42,11};
	int [] numbers2= {11,18,29,37,42,49,51,36};
	int index1 = indexOf(numbers,29);
	int index = indexOf2(numbers2,37);
	int index2 = indexOf2(numbers2,33);
	if(index !=-1)
		System.out.println("Elmanin indeksi : "+index);
	else
		System.out.println("Elmanin bulunmadi");
	if(index1 !=-1)
		System.out.println("Elmanin indeksi : "+index1);
	else
		System.out.println("Elmanin bulunmadi ");
	if(index2 !=-1)
		System.out.println("Elmanin indeksi : "+index2);
	else
		System.out.println("Elmanin bulunmadi");

}
public static int indexOf(int []numbers , int target) {
	for (int i = 0; i< numbers.length; i++) {
		if(numbers[i] == target)
			return i;
		}
	return -1;
	}

public static int indexOf2(int []numbers2, int target) {
	int i=0;
	while(i<numbers2.length && numbers2[i] <= target) {
		if(numbers2[i] == target)
			return i;
		else
			i++;
	}
	return -1;
}
}
