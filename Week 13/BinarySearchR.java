import java.util.Arrays;
public class BinarySearchR {
public static void main(String[] args) {
	int [] numbers= {63,18,51,37,29,49,42,11};
	int [] numbers2= {11,18,29,37,42,49,51,36};
int index = binarySearchR(numbers2,42,0,numbers2.length-1);
	if(index !=-1)
		System.out.println("Elemanin indeksi : "+index);
	else
		System.out.println("Eelmanin bulunmadi");
}
public static int binarySearchR(int []numbers,int target,int min,int max) {
	if(min>max)
		return -1;
	else {
		int mid=(min+max)/2;
		if(numbers[mid]==target)
			return mid;
		else if(numbers[mid]<target)
			return binarySearchR(numbers,target,mid+1,max);
		else
			return binarySearchR(numbers,target,min,mid-1);
	}
}
public static int binarySearchR(int []numbers,int target) {
	int min=0;
	int max=numbers.length-1;
	
	while(min<=max){
		int mid = (max+min)/2;
		if(numbers[mid]==target)
			return mid;
		else if(numbers[mid]<target)
			min=mid+1;
			else
				max=mid+1;
	}
	return -1;
}}