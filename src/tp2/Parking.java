package tp2;

import java.util.ArrayList;

public class Parking {
	protected int maxPlace = 3;
	protected ArrayList<Vehicule> storage = new ArrayList<>();
	public Parking() {
	}
	public String Addvoiture(Vehicule voiture) {
		if(storage.size() < maxPlace) {
			this.storage.add(voiture);
		}
		return voiture.getHash();
	}
	public Vehicule Retourvoiture(String ticket){
		Vehicule result =null;
		for(Vehicule voiture : this.storage){
			if (ticket.equals(voiture.getHash())){
				result = voiture;
				break;
			}
		}
		if (result != null){
			this.storage.remove(result);
		}
		return result;
	}
}