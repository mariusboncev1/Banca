public class Lei extends ContBancar implements SumaTotala{

	public Lei(String numarCont, float suma) {
		super(numarCont, suma);
	}

	public void transfer(ContBancar contDestinatie, float suma) {
		this.setSuma(this.getSuma() - suma);
		contDestinatie.setSuma(getSuma() + suma);
	}

	@Override
	public float getSumaTotala() {
		return this.getSuma();
	}
}