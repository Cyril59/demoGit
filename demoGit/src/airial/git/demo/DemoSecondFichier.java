package airial.git.demo;

import java.util.Calendar;

public class DemoSecondFichier {
/**
 * Lancement de la version 2.
 * @param args
 */
public static void main(String[] args) {
	int date = Calendar.getInstance().get(Calendar.MONTH);
	switch (date) {
	case 1:
		System.out.println("Bonne année !");
		break;

	default:
		System.out.println("Et au revoir...");
		break;
	}
	
}
}
