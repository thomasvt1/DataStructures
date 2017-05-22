
public class Student {
	
	private int studentnummer, leeftijd;
	private String naam, geslacht;
	private Student next;
	
	public Student(int studentnummer, int leeftijd, String naam, String geslacht) {
		super();
		this.studentnummer = studentnummer;
		this.leeftijd = leeftijd;
		this.naam = naam;
		
		if (geslacht.equalsIgnoreCase("m") || geslacht.equalsIgnoreCase("v"))
			this.geslacht = geslacht;
		else
			this.geslacht = "m";
	}
	
	public void printStudent() {
		System.out.println("////////// ~ STUDENT INFO ~ \\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("Studentnummer: " + studentnummer);
		System.out.println("Naam: " + naam);
		System.out.println("Geslacht: " + geslacht);
		System.out.println("----------------------------------------");
	}
	
	
	public String toString() {
		return "TODO";
	}

	public int getStudentnummer() {
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(String geslacht) {
		if (geslacht.equalsIgnoreCase("m") || geslacht.equalsIgnoreCase("v"))
			this.geslacht = geslacht;
		else
			return;
	}

	public Student getNext() {
		return next;
	}

	public void setNext(Student next) {
		this.next = next;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
}