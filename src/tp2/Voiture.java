package tp2;

public class Voiture extends Vehicule {
	public Voiture(String immatriculation, int nbPlace) {
		super(immatriculation, nbPlace);
		boolean typevoiture = true;
	}
	
	public Voiture(String immatriculation) {
		super(immatriculation);
	}
	
	@Override
	public String getImmatriculation() {
		return super.getImmatriculation();
	}
	
	@Override
	public void setImmatriculation(String immatriculation) {
		super.setImmatriculation(immatriculation);
	}
	
	@Override
	public int getNbPlace() {
		return super.getNbPlace();
	}
	
	@Override
	public void setNbPlace(int nbPlace) {
		super.setNbPlace(nbPlace);
	}
	
	@Override
	public String getHash() {
		return super.getHash();
	}
}
//coucou