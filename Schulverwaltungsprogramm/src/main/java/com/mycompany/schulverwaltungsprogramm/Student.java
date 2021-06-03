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
public class Student extends Person{
    private String stdnum; // Studentnummer
	
	// default constructor
	public Student() {
		super();
		this.stdnum = null; 
	}
	
	//constructor
	public Student(String stdnum, String vorname, String nachname, String geburtsdatum, String geschlecht, Adresse adres) {
		
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
