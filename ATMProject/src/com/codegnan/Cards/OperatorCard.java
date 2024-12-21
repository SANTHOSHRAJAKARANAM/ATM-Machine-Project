package com.codegnan.Cards;

import com.codegnan.Interfaces.IATMServices;
import com.codegnan.customexceptions.InsufficientBalanceException;
import com.codegnan.customexceptions.InsufficientMachineBalanceException;
import com.codegnan.customexceptions.InvalidAmountException;
import com.codegnan.customexceptions.NotAOperatorException;

public class OperatorCard implements IATMServices {
	private int pinNumber;
	private long id;
	private String name;
	private final String type="operator";
	public OperatorCard(long id,int pin,String name) {
		id=id;
		pinNumber=pin;
		this.name=name;
	}
	
	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double withdrawnAmount(double wthAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositAmount(double dptAmount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double checkBalanace() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restPinChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMiniStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public void resetPinChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
