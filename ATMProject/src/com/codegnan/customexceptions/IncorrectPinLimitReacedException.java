package com.codegnan.customexceptions;

public class IncorrectPinLimitReacedException extends Exception {
	public IncorrectPinLimitReacedException(String errorMsg) {
	super(errorMsg);
	}
}
