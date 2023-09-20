package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What positive integer would you like to sieve up to?");
		int n = scan.nextInt();
		
		boolean composite = false;
		// create numbers array variable + declare it as size n
		int [] numbers = new int [n-1];
		int index =  0;
		for (int i = 2; i <= n; i++) {
			numbers[index] = i;
			index++;
		}	
		//int [] primeNums = new int [n];
		//int loc = 0;
		for (int num : numbers) {
			// check that it's prime
			for (int j = 2; j<num; j++) {
				
				while (composite=false)
				{
				if ((double) (num/j) == (((double)num)/j)) {
					// means that it's composite
					composite = true;
					System.out.print(num);
					//primeNums [loc] = num;
					//loc++;
			}
			// break out of while loop when it's composite
			
				}

			}
			}
	}
}
