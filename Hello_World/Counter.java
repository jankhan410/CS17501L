package javaproject;

public class Counter {

	int value;
	public void click() {
		// TODO Auto-generated method stub
		value=value+1;
	}

	public void unclick() {
		// TODO Auto-generated method stub
		value=value-1;
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	
	}

	public void reset() {
		// TODO Auto-generated method stub
		value=0;
	}

	public void clickMany(int clickMany) {
		// TODO Auto-generated method stub
		value=value+clickMany;
	}

	public void unclickMany(int unclickMany) {
		// TODO Auto-generated method stub
		value=value-unclickMany;
	}

}
