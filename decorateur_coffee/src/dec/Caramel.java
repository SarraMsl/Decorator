package dec;

import decorateur_coffee.Boisson;

public class Caramel extends DecorateurBoisson {

	public Caramel(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		
		return 15+boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+ " au caramel";
	}

}
