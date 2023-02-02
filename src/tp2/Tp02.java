package tp2;
import java.util.Scanner;

public class Tp02 {
	Parking parking = new Parking();
	public static void main(String[] args) {
		Tp02 app = new Tp02();
		app.mainLoop();
	}
	public void mainLoop(){
		String immatriculation;
		int nbPlace;
		String ticket;
		String testTicket;
		Scanner sc = new Scanner(System.in);
		String choice;
		String choixVehicule;
		do {
			System.out.println("Choisissez votre action:\n\t*P pour vérifier le nombres de places de parking disponibles\n\t*E pour enregister un véhicule\n\t*S pour sortir un véhicule\n\t*Q pour quiter");
			choice = sc.nextLine().toUpperCase();
			switch (choice){
				case "P":
					System.out.println("Places libre :"+(parking.maxPlace -parking.storage.size()));
					break;
				case "E":
					
					//System.out.println("Choisissez votre type de vehicule:\n\t*V pour une voiture\n\t*M pour une moto");
					//choixVehicule = sc.nextLine().toUpperCase();
					System.out.println("Entrez L'immatriculation:");
					immatriculation = sc.nextLine();
					System.out.println("Entrez le nombre de places:");
					nbPlace = Integer.parseInt(sc.nextLine());
					System.out.println("Choisissez votre type de vehicule:\n\t*V pour une voiture\n\t*M pour une moto");
					choixVehicule = sc.nextLine().toUpperCase();
					Vehicule vehicule = null;
					do {
						if (choixVehicule.equals("V")) {
							vehicule = new Voiture(immatriculation, nbPlace);
						} else if(choixVehicule.equals("M")) {
							vehicule = new Moto(immatriculation, nbPlace);
						}else {
							System.out.println("Choisissez un charactère valide pour le véhicule");
						}
					}while (choixVehicule.equals("M") && choixVehicule.equals("V"));
					ticket = this.parking.Addvehicule(vehicule);
					System.out.println("Votre ticket : *" + ticket);
					break;
				case "S":
					System.out.println("Entrez le ticket:");
					testTicket = sc.nextLine();
					parking.Retourvehicule(testTicket);
					break;
				case "Q": break;
				default:
					System.out.println("Choisissez un charactère valide");
			}
		} while (!choice.equals("Q"));
	}
}// coucou