package entities;
import java.time.LocalDate;

public class Person {
	
	private String vorname;
	private String nachname;
	private LocalDate geburtsdatum;
	private boolean geschlecht;  // 1 --> Male, 0 --> Female
	private Adresse adres;
	
	//default constructor
	public Person() {
		this.vorname = "UNDEFINIERT";
		this.nachname = "UNDEFINIERT";
		this.geburtsdatum = LocalDate.of(0, 0, 0);
		this.geschlecht = false;
		this.adres = new Adresse();
	}
	//constructor
	public Person(String vorname, String nachname, LocalDate geburtsdatum, boolean geschlecht, Adresse adres) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.geschlecht = geschlecht;
		this.adres = adres;
	}

	//getter und setter Methoden
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public boolean isGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(boolean geschlecht) {
		this.geschlecht = geschlecht;
	}
	 // toString Method
	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", geburtsdatum=" + geburtsdatum
				+ ", geschlecht=" + geschlecht + ", adres=" + adres + "]";
	}
	
	
}
