public class App {
    public static void main(String[] args) throws Exception {
        
        ContBancar cb1 = new Lei("7897890",12393);
		ContBancar cb2 = new Euro("780870",6890);
		
		Client claient1 = new Client("Marti", "Independentei", cb1, null, null, null);
        Client claient2 = new Client("Bambi", "Unirii", cb2, null, null, null);

		
		Banca b = new Banca("3873945398693");
		
		b.addClient(claient1);
		
		b.afisareClient("Marti");

    }
}