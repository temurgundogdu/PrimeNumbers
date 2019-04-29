package math;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {

		ArrayList<Long> prime = new ArrayList<Long>();
		boolean isPrime = true;

		long limit = 9_223_372_036_854_775_806L;
		for (long i = 2; i < limit; i++) {

			isPrime = checkPrime(i);

			if (isPrime) {
				prime.add(i); System.out.println(i + " is a prime number");
				/*if (checkPrime((long) (Math.pow(2, i) - 1))) {
					System.out.println("Prime number " + i + " is a Mersenne prime.");
				}*/
			}
		}
	}

	public static boolean checkPrime(long d) {
		boolean isPrime = true;
		for (long j = 2; j <= d - 1; j++) {
			if (d % j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
