import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter a Number : ");
		int num = sc.nextInt();

		if (num == 0 || num == 1) {
			System.out.println (num+" is neither Prime no. nor composite number.");
			return;
		}

		int count = 0;

		for (int i=2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				count++;
		}


		if (count == 0)
			System.out.println (num+" is a Prime no.");
		else
			System.out.println (num+" is a Composit no.");

	}

}