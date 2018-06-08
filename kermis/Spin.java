package kermis;

public class Spin extends Attractie implements RisicoRijkeAttractie{

	@Override
	public boolean opstellingsKeuring() {
		System.out.println("De attractie moet gecontroleerd worden.");
		System.out.println("Het is weer veilig.");
		return false;
	}
}
