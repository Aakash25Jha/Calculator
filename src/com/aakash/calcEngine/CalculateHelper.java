package com.aakash.calcEngine;

public class CalculateHelper {

	MathCommands command;
	double leftValue;
	double rightValue;
	double result;
	public static final char ADD_SYMBOL = '+';
	public static final char SUBTRACT_SYMBOL = '-';
	public static final char MULTIPLY_SYMBOL = '*';
	public static final char DIVIDE_SYMBOL = '/';

	public void process(String statement) throws InvalidStatementException {
		// add 1.0 2.0
		String[] parts = statement.split(" ");
		if(parts.length!=3)
			throw new InvalidStatementException("Incorrect Number of Feilds", statement);
		String commandString = parts[0];
		try
		{
		leftValue = Double.parseDouble(parts[1]);
		rightValue = Double.parseDouble(parts[2]);
		}catch (NumberFormatException e) {
		throw new InvalidStatementException("Non-Numeric Data", statement, e);
		}setCommandfromString(commandString);
		if(command==null)
			throw new InvalidStatementException("Invalid Command", statement);
		CalculateBase calci = null;
		switch (command) {
		case Add:
			calci = new Adder(leftValue, rightValue);
			break;
		case Subtract:
			calci = new Subtracter(leftValue, rightValue);
			break;
		case Divide:
			calci = new Divider(leftValue, rightValue);
			break;
		case Multiply:
			calci = new Multiplier(leftValue, rightValue);
			break;
		}
		calci.calculate();
		result = calci.getResult();
	}

	@Override
	public String toString() {
		char symbol = ' ';
		switch (command) {
		case Add:
			symbol = ADD_SYMBOL;
			break;
		case Subtract:
			symbol = SUBTRACT_SYMBOL;
			break;
		case Multiply:
			symbol = MULTIPLY_SYMBOL;
			break;
		case Divide:
			symbol = DIVIDE_SYMBOL;
			break;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(leftValue);
		sb.append(' ');
		sb.append(symbol);
		sb.append(' ');
		sb.append(rightValue);
		sb.append(' ');
		sb.append('=');
		sb.append(' ');
		sb.append(result);

		return sb.toString();
	}

	private void setCommandfromString(String commandString) {
		if (commandString.equalsIgnoreCase(MathCommands.Add.toString()))
			command = MathCommands.Add;
		else if (commandString.equalsIgnoreCase(MathCommands.Subtract.toString()))
			command = MathCommands.Subtract;
		else if (commandString.equalsIgnoreCase(MathCommands.Multiply.toString()))
			command = MathCommands.Multiply;
		else if (commandString.equalsIgnoreCase(MathCommands.Divide.toString()))
			command = MathCommands.Divide;
	}
}