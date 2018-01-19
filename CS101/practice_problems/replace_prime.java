import java.util.Scanner;
public class Replace_prime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int[5];
		for(int i = 0; i < numbers.length; i++){
		      System.out.println("Enter numbers: ");
		      numbers[i] = input.nextInt();
		    }
		changePrime(numbers);
		for(int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		System.out.println("What number are you looking for?: ");
		int x = input.nextInt();
		System.out.println(key(numbers,x));
	}
	public static int isPrime(int n) {
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				return 1;
			}
		}
		return 0;
	}
	public static void changePrime(int [] array) {
		int counter = 0;
		while(counter < array.length) {
		if(isPrime(array[counter]) == 0) {
			array[counter] = -1;
		}
		counter += 1;
		}
	}
	public static int key(int[] numbers, int key) {
		for(int i = 0;i < numbers.length; i++) {
			if(numbers[i] == key) {
				return 1;
			}
		}
		return 0;
	}
}
