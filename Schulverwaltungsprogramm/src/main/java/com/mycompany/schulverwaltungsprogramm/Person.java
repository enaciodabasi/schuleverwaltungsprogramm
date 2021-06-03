/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;
import java.time.LocalDate;
/**
 *
 * @author enaci
 */
public class Person {
        private String vorname;
	private String nachname;
	private String geburtsdatum;
	private String geschlecht;  // 1 --> Male, 0 --> Female
	private Adresse adres;
	
        //constructor
	public Person(String vorname, String nachname, String geburtsdatum, String geschlecht, Adresse adres) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.geschlecht = geschlecht;
		this.adres = adres;
	}

	//default constructor
	public Person() {
		this.vorname = null;
		this.nachname = null;
		this.geburtsdatum = null;
		this.geschlecht = null;
		this.adres = null;
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

	public String getDate(){
            return geburtsdatum;
        }
        
        public String getGeschlect(){
            return geschlecht;
        }
        
        public Adresse getAdres(){
            return adres;
        }
	 // toString Method
	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", geburtsdatum=" + geburtsdatum
				+ ", geschlecht=" + geschlecht + ", adres=" + adres + "]";
	}
	
	
}
