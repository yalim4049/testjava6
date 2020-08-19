package com.tech1.trans;

public class Train extends Trans{

	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis);
		this.tDan=tDan;
	}

	private int tDan;

	@Override
	public int getCharge() {
		
		return cusCnt*dis*tDan;
		
	}

}
