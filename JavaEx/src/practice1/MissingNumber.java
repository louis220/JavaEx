package practice1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();

	String array[] = new String [num];
	for(int i = 0; i <array.length; i++) {
			array[i] = scanner.next();
			
	}
	Scanner scanner2 = new Scanner(System.in);
	int num2 = scanner.nextInt();

	String array2[] = new String [num2];
	for(int i = 0; i <array2.length; i++) {
			array2[i] = scanner.next();
	

	//contains
}
	System.out.println(Arrays.toString(array));
	System.out.println(Arrays.toString(array2));
	
//	System.out.println(Arrays.equals(array, array2));
	
//	if (Arrays.deepEquals(array, array2)) {
//		
//	
//	
//}
//	
//	
//	for(int i =0; i <array.length; i++) {
//		
//	 for(int j=0; j<array2.length; j++) {
//		
//		while (array.length == array2.length) {
//			String array3[] = 
//			System.out.println(Arrays.toString(array3);
//			j++;
//			if(array[i] == array[j]) {
//				String array3[] = new String [j];
//				break;
//			}
			
//			List newarray = CollectionUtils.subtract(Arrays.asList(array), Arrays.asList(array2));
		// 원래 array - 새로운 array3 = 답
			Collection newarray = CollectionUtils.removeAll(Arrays.asList(array), 
                    Arrays.asList(array2));
	
				System.out.println(newarray);
			}
		
	
	}
	
	

