package com.codegnan.Interfaces;

import com.codegnan.customexceptions.InsufficientBalanceException;
import com.codegnan.customexceptions.InsufficientMachineBalanceException;
import com.codegnan.customexceptions.InvalidAmountException;
import com.codegnan.customexceptions.NotAOperatorException;

public interface IATMServices {
	//to get the user type,weather the user id operator or normal user
public abstract String getUserType() throws NotAOperatorException;

//to withdraw amount
//1)will throw InvalidAmountException if the amount is not a valid denomination
//2)will throw InsufficientBalanceException if the customer has insufficient amount
//3)will throw InsufficientMachineBalanceException if the machine has insufficient amount
public abstract double withdrawnAmount(double wthAmount)throws InvalidAmountException,InsufficientBalanceException,InsufficientMachineBalanceException;

//to deposit amount
public abstract double depositAmount(double dptAmount) throws InvalidAmountException;

//to check balance
public abstract double checkBalanace();
//to change the pin
public abstract void changePinNumber(int pinNumber);

//to get the user name
public abstract String getUserName();

//to get the chances of pin number
public abstract int getChances();

//to decrease the number of chances while enter the wrong pin number
public abstract void decreaseChances();

//to reset pin number chances by bank operator
public abstract void restPinChances();

//to get the MINIStatement of an Account
public abstract void getMiniStatement();

double withdrawAmount(double wthAmount)
		throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException;

int getPinNumber();

void resetPinChances();

double checkBalance();





}
