package com.findbugs.examples;

@Deprecated
public class CalendarYear {
	//FIXME : Remove this class after usage
	private String[] months;

	public CalendarYear(){

	}
	public String[] getMonths() {
		String[] copyM = months;
		return copyM;
	}
	
	//TODO : Code cleanup

	public void setMonths(String[] months) {
		this.months = months;
	}

}
