package com.hdfc.loans.carloans;

public class FIrStClass implements SecondClass{
	int a=20,b=30,c=0;
	public void multiplication()
	{
		c=a*b;
		System.out.println("multiplication of a&b are:"+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FIrStClass obj=new FIrStClass();
		obj.multiplication();
		obj.addition();
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("addition override in seconclass");
	}

}
