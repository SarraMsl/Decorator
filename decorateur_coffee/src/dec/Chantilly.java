package dec;

import decorateur_coffee.Boisson;

public class Chantilly extends DecorateurBoisson {

	public Chantilly(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		
		return 25+boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+ " au chantilly";
	}

}
