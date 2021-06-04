package forPetlja;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/*For1: Napisati program koji omoguciti korisniku da unosi recii, sve dok ne unese rec “stop”, 
		 * nebitno da li je koristio mala, velika slova ili kombinaciju. Mozete pri radu koristiti petlju po izboru.
		 */

		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("Unesite neku rec: ");
			String s = sc.nextLine();
			String stop = "stop";
			if(s.toLowerCase().equals(stop)) {
				System.out.println("Uneli ste stop, kraj programa.");
				break;
			}else {
				System.out.println(s);
			}
				
		}
	}

}
