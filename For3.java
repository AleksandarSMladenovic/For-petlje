package forPetlja;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		/*
		 * For3: Napraviti program koji ce odstampati na standardnom izlazu trougao od
		 * zvezdica. Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati
		 * ovako: n = 5 *****
		 * 				 ****
		 *				  *** 
		 *				   ** 
		 *					*
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj redova: ");
		int brojRedova = sc.nextInt();

		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k < brojRedova; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
