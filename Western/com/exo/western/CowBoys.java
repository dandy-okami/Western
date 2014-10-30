package com.exo.western;

public class CowBoys extends Humain {
private static int nbLadiesFreedom;
	protected CowBoys(String name, String drink) {
		super(name);
		
	}
	public void jailbreakLadies(Ladies ladie){
		ladie.setFreedom(true);
		nbLadiesFreedom++;
		System.out.println("Ye ladie you are free.");
	}



}
