package com.exo.western;

public class Robber extends Humain{
	private String style;
	private boolean inJail;
	public Robber(String name) {
		super(name);
		drink="wiskey";
		this.style="angry";
		this.inJail=false;
}
	public void KidnappedLadies(Ladies ladie){
		System.out.println("ah ah "+ladie.getName()+" your're mine fuck police");
	}
	public void getInJail(CowBoys cowboys){
		inJail=false;
		System.out.println("Damn "+cowboys.getName()+" you got me ");
	}

}
