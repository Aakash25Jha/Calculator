package com.aakash.myapp;

import com.aakash.calcEngine.*;
public class Logic {

	public void main(Integer[] args) {
		/*
		 * MathEquation testEquation = new MathEquation(); testEquation.execute();
		 */
		MathEquation[] me = new MathEquation[4];
		me[0] = new MathEquation(100.0d, 50.0d, 'd');
		me[1] = new MathEquation(90.0d, 45.0d, 'a');
		me[2] = new MathEquation(40.0d, 20.0d, 's');
		me[3] = new MathEquation(2.0d, 10.0d, 'm');
		/*
		 * double val1 = 100; double val2 = 10; double result = 0;
		 * 
		 * char opCode = 'd';
		 */

		for (MathEquation Equation : me) {
			Equation.execute();
			System.out.println("Result=" + " " + Equation.getResult());
		}

		System.out.println();
		System.out.println("Using Overloading");
		System.out.println();

		double leftDouble = 9.0d;
		double rightDouble = 4.0d;
		MathEquation equationOverload = new MathEquation('d');
		equationOverload.execute(leftDouble, rightDouble);
		System.out.println(equationOverload.getResult());

		System.out.println();
		System.out.println("Using Inheritance");
		System.out.println();

		CalculateBase[] calculator = { new Divider(100.0d, 50.0d), new Adder(90.0d, 45.0d),
				new Subtracter(40.0d, 20.0d), new Multiplier(2.0d, 10.0d) };
		for (CalculateBase cal : calculator) {
			cal.calculate();
			System.out.println("The Result is=" + " " + cal.getResult());
		}
	}

	public static void main(String args[]) {
		System.out.println();
		System.out.println("Using Enum");
		System.out.println();

		String[] statements = { "Add 1.0", "Add xx 25.0", "Addx 0.0 0.0", "Divide 100.0d 50.0d", "Add 90.0d 45.0d",
				"Subtract 40.0d 20.0d", "Multiply 2.0d 10.0d" };
		CalculateHelper helper = new CalculateHelper();
		for (String statement : statements) {
			try{helper.process(statement);
			System.out.println(helper.toString());
		}catch(InvalidStatementException e){
			System.out.println(e.getMessage());
			if(e.getCause() != null)
				System.out.println("Original Exception: "+e.getCause().getMessage());
		}
		}

	}
}
