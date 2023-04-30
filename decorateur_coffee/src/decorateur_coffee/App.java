package decorateur_coffee;

import dec.Chocolat;
import dec.Lait;
import dec.Sucre;

public class App {

	public static void main(String[] args) {
	Boisson b= new Sucre(new Chocolat(new Lait(new Chocolat(new Lait(new Espresso())))));
		System.out.println(b.getDescription());
		System.out.println(b.cout());

	}

}
