package Polimorfismo;

public class AnimalPolimorfo {

	public static void main(String[] args) {
		
		Pessoa an = new Pessoa();
		Cachorro c = new Cachorro();
		Gato gt = new Gato();
		
		
		an.emiteSom();
		c.emiteSom();
		gt.emiteSom();
				

	}

}
