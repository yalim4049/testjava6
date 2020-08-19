package com.tech1.trans;

public class Express extends Trans implements Start,End{
	
		
	public Express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis);
		this.eDan=eDan;
	}

	private int eDan;

	@Override
	public int getCharge() {
		
		return cusCnt*dis*eDan;
		
	}

	@Override
	public String getStartStaition() {
		
		return "서울";
	}
	
	@Override
	public String getEndStation() {
		
		return "부산";
	}
}
