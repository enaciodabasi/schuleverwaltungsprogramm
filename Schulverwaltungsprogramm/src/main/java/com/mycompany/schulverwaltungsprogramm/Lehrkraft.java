/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;

/**
 *
 * @author enaci
 */
public class Lehrkraft extends Person{
    private String lehrnum;
	
	public Lehrkraft(){
		super();
		this.lehrnum = null;
	}
	
	public Lehrkraft(String lehrnum,  String vorname, String nachname, String geburtsdatum, String geschlecht, Adresse adres) {
		super(vorname, nachname, geburtsdatum, geschlecht, adres);
		this.lehrnum = lehrnum;
	}

	@Override
	public String toString() {
		
		String s = super.toString();
		
		return "Lehrkraft [lehrnum=" + lehrnum + s + "]";
	}
}
