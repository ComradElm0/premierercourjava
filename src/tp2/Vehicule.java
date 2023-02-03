package tp2;

public abstract class Vehicule  {
	protected String immatriculation;
	protected int nbPlace;
	public Vehicule(String immatriculation){
		this.immatriculation = immatriculation;
	}
	public Vehicule(String immatriculation, int nbPlace){
		this.immatriculation = immatriculation;
		this.nbPlace = nbPlace;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		if (!immatriculation.isEmpty()){
			this.immatriculation = immatriculation;
		}
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public String getHash(){
		return this.immatriculation + this.nbPlace;
	}
}//coucou