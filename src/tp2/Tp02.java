package tp2;
import java.io.File;
import java.util.Scanner;

public class Tp02 {
	Parking parking = new Parking();
	private Historique log;
	private Scanner sc;
	public static void main(String[] args) {
		Tp02 app = new Tp02();
		app.mainLoop();
	}
	public void mainLoop(){
		
		String immatriculation;
		int nbPlace;
		String ticket;
		String testTicket;
		String choice;
		String choixVehicule;
		this.log = new Historique();
		this.sc = new Scanner(System.in);
		do {
			System.out.println("Choisissez votre action:\n\t*P pour vérifier le nombres de places de parking disponibles\n\t*E pour enregister un véhicule\n\t*S pour sortir un véhicule\n\t*Q pour quiter");
			choice = sc.nextLine().toUpperCase();
			switch (choice){
				case "P":
					System.out.println("Places libre :"+(parking.maxPlace -parking.storage.size()));
					System.out.println(Nombrevehicules(parking));
					break;
				case "E":
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
							choixVehicule = sc.nextLine().toUpperCase();
						}
					}while (choixVehicule.equals("M") && choixVehicule.equals("V"));
					
					try {
						ticket = this.parking.Addvehicule(vehicule);
						this.log.info(vehicule, ParkingDirection.IN);
						System.out.println(String.format("Ticket : %s", ticket));
					} catch (ParkingFullException e) {
						System.out.println("Le parking est plein.");
					}
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
		sc.close();
	}
	public String Nombrevehicules(Parking parking){
		int nbvoiture=0;
		int nbmoto=0;
		String result;
		for (Vehicule vehicule: parking.storage) {
			if (vehicule instanceof Voiture) {
				nbvoiture++;
			}
			if (vehicule instanceof Moto) {
				nbmoto++;
			}
		}
			result = "Il y a "+nbvoiture+" voitures et "+nbmoto+" motos.";
			return result;
		}
	}
