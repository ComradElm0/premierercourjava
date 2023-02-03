package tp2;

import javax.management.ObjectInstance;
import java.util.ArrayList;

public class Parking {
	protected int maxPlace = 100;
	protected ArrayList<Vehicule> storage = new ArrayList<>();
	public Parking() {
	}
	public String Addvehicule(Vehicule vehicule) {
		if(storage.size() < maxPlace) {
			this.storage.add(vehicule);
		}
		return vehicule.getHash();
	}
	public Vehicule Retourvehicule(String ticket){
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
}
//coucou