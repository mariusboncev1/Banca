import java.util.ArrayList;

public class Client {
     
	private String nume,adresa;
	private ArrayList<ContBancar> conturi;
	private final int MaxBancCounts = 5;
	
	
	public Client(String nume, String adresa, ContBancar... conturi) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = new ArrayList<ContBancar>();
        for (int i = 0; i < conturi.length && i < MaxBancCounts; i++) {
            this.conturi.add(conturi[i]);
        }
    }
    

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public ArrayList<ContBancar> getConturi() {
		return conturi;
	}

	public void setConturi(ArrayList<ContBancar> conturi) {
		this.conturi = conturi;
	}
	
	public boolean addContBancar(ContBancar c) {
		if (conturi.size()<MaxBancCounts)
		{
			conturi.add(c);
			return true;
		}
		return false;
	}

}