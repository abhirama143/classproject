package com.hdfc.loans.carloans;

public class ChildClass1 extends AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 h=new ChildClass1();
		h.method1();
		h.method2();
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 over ride in abstractclass1"
				);
	}

}
