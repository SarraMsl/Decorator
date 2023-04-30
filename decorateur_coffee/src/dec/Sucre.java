package dec;

import decorateur_coffee.Boisson;

public class Sucre extends DecorateurBoisson {

	public Sucre(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		
		return boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+ " sucré";
	}

}