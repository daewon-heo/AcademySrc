package remd.test1;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = new int[6];

		Random rand = new Random();

		// 입력부
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100) + 1;
		}
		
		System.out.println("할당된 배열의 크기 : " + array.length);

		ArrayTest at = new ArrayTest();
		at.print(array);
		
		System.out.println("가장 큰 값 : " + at.max(array));
		System.out.println("가장 작은 값 : " + at.min(array));
		System.out.println("짝수의 개수 : " + at.evenCount(array) + " 개");
		System.out.println("홀수의 개수: " + at.oddCount(array) + " 개");
		System.out.println("합계 : " + at.sum(array));
		System.out.printf("평균 : %.2f" , at.avg(array));
	}

	public int sum(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public double avg(int[] arr) {
		double avg = 0;
		
		avg = sum(arr)/arr.length;
		
		return avg;
	}
	
	public int max(int[] arr) {
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		
		return max;
	}
	
	public int min(int[] arr) {
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		
		return min;
	}
	
	public int evenCount(int[] arr) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0)
				count++;
		}
		
		return count;
	}
	
	public int oddCount(int[] arr) {
		return arr.length - evenCount(arr);
	}
	
	public void print(int[] arr) {
		System.out.print("array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
