package entities;
import java.time.LocalTime;


public class Fach  {
	
	private String fachname;
	private String themen[];
	private Lehrkraft lehrer;
	private LocalTime uhrzeit;
	private LocalTime dauer;
	
	
	public Fach() {
		
		this.fachname = null;
		this.themen = null;
		this.lehrer = new Lehrkraft();
		this.uhrzeit = null;
		this.dauer = null;
	}
	
	public Fach(String fachname, String themen[], Lehrkraft lehrer, LocalTime uhrzeit, LocalTime dauer) {
		
		this.fachname = fachname;
		this.themen = themen;
		this.lehrer = lehrer;
		this.uhrzeit = uhrzeit;
		this.dauer = dauer;
	}
	
}
