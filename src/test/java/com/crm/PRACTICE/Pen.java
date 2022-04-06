package com.crm.PRACTICE;

public class Pen 
{

	 private String clr;
	private int price;
	
	
	
	public Pen(String clr, int price) {
		
		this.clr = clr;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Pen [clr=" + clr + ", price=" + price + "]";
	}



	public static void main(String[] args) 
	{
		Pen p=new Pen("White", 34);
		System.out.println(p);
		System.out.println(p.clr);
		System.out.println(p.price);
		
	}
}
