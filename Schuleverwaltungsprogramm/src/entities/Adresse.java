package entities;

public class Adresse {
	
	private String land;
	private String stadt;
	private String bezirk;
	private String plz;
	private String strasse;
	private String hausnummer;
	private String t�rnummer;
	
	
	// default constructor
	
	public Adresse() {
		this.land = null;
		this.stadt = null;
		this.bezirk = null;
		this.plz = null;
		this.strasse = null;
		this.hausnummer = null;
		this.t�rnummer = null;
	}
	
	// constructor
	public Adresse(String land, String stadt, String bezirk, String plz, String strasse, String hausnummer, String t�rnummer) { 
		this.land = land;
		this.stadt = stadt;
		this.bezirk = bezirk;
		this.plz = plz;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.t�rnummer = t�rnummer;
	}
	
	// getter und setter Methoden
	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getBezirk() {
		return bezirk;
	}

	public void setBezirk(String bezirk) {
		this.bezirk = bezirk;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getT�rnummer() {
		return t�rnummer;
	}

	public void setT�rnummer(String t�rnummer) {
		this.t�rnummer = t�rnummer;
	}

	@Override
	public String toString() {
		return "Adresse [land=" + land + ", stadt=" + stadt + ", bezirk=" + bezirk + ", plz=" + plz + ", strasse="
				+ strasse + ", hausnummer=" + hausnummer + ", t�rnummer=" + t�rnummer + "]";
	}
	
	
}
