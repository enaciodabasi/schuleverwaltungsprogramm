package entities;

import java.time.LocalDate;

public class Lehrkraft extends Person {

	private String lehrnum;
	
	public Lehrkraft(){
		super();
		this.lehrnum = null;
	}
	
	public Lehrkraft(String lehrnum,  String vorname, String nachname, LocalDate geburtsdatum, boolean geschlecht, Adresse adres) {
		super(vorname, nachname, geburtsdatum, geschlecht, adres);
		this.lehrnum = lehrnum;
	}
	
	
}
