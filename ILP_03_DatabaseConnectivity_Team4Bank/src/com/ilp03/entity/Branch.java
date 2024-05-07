package com.ilp03.entity;

public class Branch {
	private int id;
	private String branchCode;
	private String branchName;
	private String branchManagerName;
	private long phNumber;
	
	public Branch(int id, String branchCode, String branchName, String branchManagerName, long phNumber) {
		this.id = id;
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.branchManagerName = branchManagerName;
		this.phNumber = phNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchManagerName() {
		return branchManagerName;
	}

	public void setBranchManagerName(String branchManagerName) {
		this.branchManagerName = branchManagerName;
	}

	public long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	
		
}
