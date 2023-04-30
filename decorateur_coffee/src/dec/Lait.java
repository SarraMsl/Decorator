package dec;

import decorateur_coffee.Boisson;

public class Lait extends DecorateurBoisson {

	public Lait(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		
		return 20+boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+ " au lait";
	}

}
