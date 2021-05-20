package entities;

import java.time.LocalDate;

public class Student extends Person{
	
	private String stdnum; // Studentnummer
	
	// default constructor
	public Student() {
		super();
		this.stdnum = "000000"; 
	}
	
	//constructor
	public Student(String stdnum, String vorname, String nachname, LocalDate geburtsdatum, boolean geschlecht, Adresse adres) {
		
		super(vorname, nachname, geburtsdatum, geschlecht, adres);
		this.stdnum = stdnum;
	}

	//getter und setter Methoden
	public String getStdnum() {
		return stdnum;
	}

	public void setStdnum(String stdnum) {
		this.stdnum = stdnum;
	}

	@Override
	public String toString() {
		
		String s = super.toString();
		
		return "Student [Studentnummer=" + s;
	}
	
}
