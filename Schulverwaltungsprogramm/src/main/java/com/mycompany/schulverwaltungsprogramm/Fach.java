/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;
import java.time.LocalTime;
import java.util.Arrays;

/**
 *
 * @author enaci
 */
public class Fach {
       private String fachname;
	private String themen;
	private String lehrer;
	private String uhrzeit;
	private String dauer;
	
	
	public Fach() {
		
		this.fachname = null;
		this.themen = null;
		this.lehrer = null;
		this.uhrzeit = null;
		this.dauer = null;
	}
	
	public Fach(String fachname, String themen, String lehrer, String uhrzeit, String dauer) {
		
		this.fachname = fachname;
		this.themen = themen;
		this.lehrer = lehrer;
		this.uhrzeit = uhrzeit;
		this.dauer = dauer;
                
                
	}

    public String getFachname() {
        return fachname;
    }

    public void setFachname(String fachname) {
        this.fachname = fachname;
    }

    public String getThemen() {
        return themen;
    }

    public void setThemen(String themen) {
        this.themen = themen;
    }

    public String getLehrer() {
        return lehrer;
    }

    public void setLehrer(String lehrer) {
        this.lehrer = lehrer;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getDauer() {
        return dauer;
    }

    public void setDauer(String dauer) {
        this.dauer = dauer;
    }

	@Override
	public String toString() {
		return "Fach [fachname=" + fachname + ", themen=" + themen + ", lehrer=" + lehrer
				+ ", uhrzeit=" + uhrzeit + ", dauer=" + dauer + "]";
	}
}
