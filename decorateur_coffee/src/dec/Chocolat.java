package dec;

import decorateur_coffee.Boisson;

public class Chocolat  extends DecorateurBoisson  {

	public Chocolat(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+ " au chocolat";
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 30+boisson.cout();
	}

}
