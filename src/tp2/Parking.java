package tp2;

import java.util.ArrayList;

public class Parking {
	protected int maxPlace = 3;
	protected ArrayList<Vehicule> storage = new ArrayList<>();
	public Parking() {
	}
	public String Addvoiture(Vehicule vehicule) {
		if(storage.size() < maxPlace) {
			this.storage.add(vehicule);
		}
		return vehicule.getHash();
	}
	public Vehicule Retourvoiture(String ticket){
		Vehicule result =null;
		for(Vehicule vehicule : this.storage){
			if (ticket.equals(vehicule.getHash())){
				result = vehicule;
				break;
			}
		}
		if (result != null){
			this.storage.remove(result);
		}
		return result;
	}
} //coucou