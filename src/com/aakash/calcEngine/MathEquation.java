package com.aakash.calcEngine;

public class MathEquation {
	private double leftVal;
	private double rightVal;
	private char opCode;
	private double result;
	
	
	public double getLeftVal() {
		return leftVal;
	}


	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}


	public char getOpCode() {
		return opCode;
	}


	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}


	public double getResult() {
		return result;
	}

	public double getRightVal() {
		return rightVal;
	}


	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}
	public MathEquation()
	{
		
	}
	public MathEquation(char opCode)
	{
		this.opCode = opCode;
	}
	public MathEquation(double leftVal, double rightVal, char opCode) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}


	public void execute()
	{	
		switch(opCode) 
		{
		case 'a': result= leftVal+ rightVal;
		break;

		case 's': result= leftVal- rightVal;
		break;

		case 'd':result= (rightVal!=0.0d)?leftVal/rightVal:0.0d;
		break;

		case 'm':result= leftVal * rightVal;
		break;

		default:
			System.out.println("Error-invalid opCode");
			result=0.0d;
			break;
		}
	}
	public void execute(double leftVal, double rightVal)
	{
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		
		execute();
	}
	public void execute(int leftVal, int rightVal)
	{
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		
		execute();
		result=(int)result;
	}
}
