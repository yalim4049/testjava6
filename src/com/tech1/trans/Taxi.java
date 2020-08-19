package com.tech1.trans;

public class Taxi extends Trans{
	

public Taxi(int cusCnt, int dis, int xDan) {
	super(cusCnt, dis);
	this.xDan=xDan;
}

private int xDan;

@Override
public int getCharge() {
	
	return cusCnt*dis*xDan;
	
}
}
