package com.gmail.gaeballza.app.model;

public class ScoreVO {
	
	private int intStNum;
	private int intScKor;
	private int intScEng;
	private int intScMath;
	private int intSum;
	private float fAvg;
	private int intRank;
	
	
	
	public int getIntStNum() {
		return intStNum;
	}
	public void setIntStNum(int intStNum) {
		this.intStNum = intStNum;
	}
	public int getIntScKor() {
		return intScKor;
	}
	public void setIntScKor(int intScKor) {
		this.intScKor = intScKor;
	}
	public int getIntScEng() {
		return intScEng;
	}
	public void setIntScEng(int intScEng) {
		this.intScEng = intScEng;
	}
	public int getIntScMath() {
		return intScMath;
	}
	public void setIntScMath(int intScMath) {
		this.intScMath = intScMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getfAvg() {
		return fAvg;
	}
	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}
	public int getIntRank() {
		return intRank;
	}
	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}
	
	
	@Override
	public String toString() {
		return "ScoreVO [intStNum=" + intStNum + ", intScKor=" + intScKor + ", intScEng=" + intScEng + ", intScMath="
				+ intScMath + ", intSum=" + intSum + ", fAvg=" + fAvg + ", intRank=" + intRank + "]";
	}
	
	

	

}
