package com.exo.western;

public class Ladies extends Humain {
private String dressColor;
private boolean freedom;
	protected Ladies(String name,String drink,String dressColor) {
		super(name);
		this.setDressColor(dressColor);
		this.drink=drink;
		this.freedom=true;
	}
	public String getDressColor() {
		return dressColor;
	}
	public void setDressColor(String dressColor) {
		this.dressColor = dressColor;
	}
	@Override
	public void presentYourSelf() {
		super.presentYourSelf();
		System.out.println(dressColor+"  "+freedom);
	}
	
	public void getKidnaped(Robber robber){
		freedom=false;
		System.out.println("ahhhhhhhhhhh call police a robber "+ robber.getName()+" kidnaped me  "+freedom);
		
	}
	public void thanks(){
		if(freedom==true){
			System.out.println("thanks a lot");
		}else{
			System.out.println("i am in jail");
		}
	}
	public boolean isFreedom() {
		return freedom;
	}
	public void setFreedom(boolean freedom) {
		this.freedom = freedom;
	}
}
