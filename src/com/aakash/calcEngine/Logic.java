 package com.aakash.calcEngine;

import java.util.Enumeration;

public class Logic {
	
	public static void main(String[] args) 
	{	
		/*
		 * MathEquation testEquation = new MathEquation(); testEquation.execute();
		 */
		MathEquation[] me= new MathEquation[4];
		me[0]=new MathEquation(100.0d, 50.0d, 'd');
		me[1]=new MathEquation(90.0d,45.0d,'a');
		me[2]=new MathEquation(40.0d,20.0d,'s');
		me[3]=new MathEquation(2.0d,10.0d,'m');
		/*
		 * double val1 = 100; double val2 = 10; double result = 0;
		 * 
		 * char opCode = 'd';
		 */
			
		for(MathEquation Equation:me)
		{
		Equation.execute();
		System.out.println("Result="+" "+Equation.getResult());
	}
	} 
}
