import java.util.ArrayList;

public class BaseJava {
	// #1
	public static void print1To255(){
		for (int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}
	
	// #2
	public static void odd1To255() {
		for (int i = 1; i <= 255; i++) {
			if ( i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	
	//#3
	public static void sum0To255() {
		int sum = 0;
		for ( int i = 0; i <= 255; i++) {
			sum += i;
			String printed = String.format("New number: %d, Sum: %d", i, sum);
			if (i % 2 == 1) {
				System.out.println(printed + ", ODD.");
			}	
			else {
				System.out.println(printed);
			}

		}
	}

	// #4
	public static void traverseArray(Object[] arr) {
		for (Object element : arr) {
			System.out.println(element);
		}
	}

	// #5
	public static double findMax(double[] arr) {
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(String.format("Maximum is: %f", max));
		return max;
	}

	// #6
	public static double average(double[] numbers) {
		double avg = 0;
		double sum = 0;
		for(double number : numbers) {
			sum += number;
		}
		avg = sum/numbers.length;
		System.out.println(String.format("The Average is: %.2f", avg));
		return avg;
	}

	// #7
	public static void oddArray() {
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();  		
		for (int i = 1; i <= 255; i++) {
			if ( i % 2 == 1) {
				// Integer s = (Integer) i;
				oddNumbers.add(i);
			}
		}
		System.out.println(oddNumbers);
	}

	// #8
	public static int greaterThan(double[] numbers ,double y) {
		int counter = 0;
		for (double number : numbers) {
			if (number > y) {
				counter += 1;
			}
		}
		return counter;
	}

	// #9
	public static double[] squared(double[] numbers) {
		double[] squares;
		squares = new double[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			squares[i] = numbers[i] * numbers[i];
			System.out.println(squares[i]);
		}
		return squares;
	}

	// #10
	public static int[] eliminateNegatives(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				numbers[i] = 0;
			}
		}
		return numbers;
	}

	// #11
	public static double[] maxMinAvg(double[] numbers) {
		double[] result;
		result = new double[3]; 
		double max = findMax(numbers);
		double avg = average(numbers);
		double min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		result[0] = max;
		result[1] = min;
		result[2] = avg;
		return result;
	}

	// #12
	public static double[] shift(double[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			numbers[i] = numbers[i+1];
		}
		numbers[numbers.length-1] = 0;
		return numbers;
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Arrays;


public class BaseJavaTest {
	public static void main(String[] args) {
		// #1
		BaseJava.print1To255();
		// #2
		BaseJava.odd1To255();
		// #3
		BaseJava.sum0To255();
		// #4
		String[] arr = {"game","now","Hello"};
		Integer[] arr1 = {1,2,3,4};
		BaseJava.traverseArray(arr);
		BaseJava.traverseArray(arr1);
		// #5
		double[] arr5;
		arr5 = new double[5];
		arr5[0] = -1; 
		arr5[1] = 2; 
		arr5[2] = -5; 
		arr5[3] = 4; 
		arr5[4] = 0; 
		BaseJava.findMax(arr5);
		// #6
		double[] arr6 = {1.2, 5.5, 8, 12, 8.6}; 
		BaseJava.average(arr6);
		// #7
		BaseJava.oddArray();
		// #8
		double[] arr8 = {6,4,7,3,2,10};
		int counter = BaseJava.greaterThan(arr8, 4);
		System.out.println(counter);
		// #9
		double[] arr9 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(BaseJava.squared(arr9)));
		// #10
		int[] toZero = {1,5,0,-1,4,-8,0,-7};
		System.out.println(Arrays.toString(BaseJava.eliminateNegatives(toZero)));
		// #11
		double[] arr11 = {-1,5,4,8,6,12,7,2};
		System.out.println(Arrays.toString(BaseJava.maxMinAvg(arr11)));
		// #12
		double[] arr12 = {-1,5,4,8,6,12,7,2};
		System.out.println(Arrays.toString(BaseJava.shift(arr11)));
	}
}