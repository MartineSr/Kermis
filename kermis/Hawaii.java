package kermis;

public class Hawaii extends Attractie implements RisicoRijkeAttractie{
	int draaiLimiet = 10;
	
	

	@Override
	public boolean opstellingsKeuring() {
		System.out.println("De attractie is niet veilig meer en moet gecontroleerd worden.");
		System.out.println("Het is weer veilig.");
		return false;
	}
}