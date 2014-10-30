package com.exo.western;

public class Humain {
private String name;
protected String drink ="water";
private String text;
	protected Humain(String name) {
	super();
	this.name = name;
	this.drink="water";
}

	public Humain(String name2, String drink2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public void talk(String text){
		this.text=text;
	}
	public void presentYourSelf(){
		System.out.println("Hello, my name is "+getName()+" and my favorite drink is a "+getDrink());
	}
	public void drink(){
		System.out.println("Ah a good drink of "+getDrink());
	}
}
