package BASICS;

import java.util.Arrays;

public class GenereicMethod {
	public static void main(String[] args) {
		Integer[] scores = { 12, 24, 3232, 323, 3232, 32332, 32323, 323 };
		String[] name = { "pablo", "diego", "jorge" };
		switchvalues(name, 0, 1);
		switchvalues(scores, 0, 1);
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(scores));
	}
/**
 * We can create generic method to reach its maximun reusability of the code of a method 
 * @param <T>
 * @param arr
 * @param index1
 * @param index2
 */
	
	public static <T> void switchvalues(T[] arr, int index1, int index2) {
		if (arr == null) {
			return;

		}
		if (index1 < 0 || index2 < 0) {
			return;
		}

//	int temp = arr[index1];
//	arr[index1] = arr[index2];
//	arr[index2] = temp;
//
//	System.out.println(Arrays.toString(arr));

		T dato = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = dato;
//	System.out.println(dato);
	}

}
