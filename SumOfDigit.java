import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter a number : ");
		int num = sc.nextInt();
		int count = 0;

		int temp = num;
		// count digits of given number.

		if(temp == 0) {
			count = 1;
		} else {
			while ( temp != 0 ) {
				count++;
				temp = temp / 10;
			}
		}
		System.out.println("Count : "+count);

		// sum of digits of given number.

		int sum = 0;
		for (int i=0; i <count; i++) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
			
		}
		System.out.println("Sum of digits of given number is : "+sum);

	}
			
}
		