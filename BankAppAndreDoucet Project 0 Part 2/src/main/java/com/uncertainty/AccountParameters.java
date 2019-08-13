package com.uncertainty;

public class AccountParameters {

	private long idAccountP;
	private long idSequence;
	private String name;
	public long getIdAccountP() {
		return idAccountP;
	}
	public void setIdAccountP(long idAccountP) {
		this.idAccountP = idAccountP;
	}
	public long getIdSequence() {
		return idSequence;
	}
	public void setIdSequence(long idSequence) {
		this.idSequence = idSequence;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AccountParameters [idAccountP=" + idAccountP + ", idSequence=" + idSequence + ", name=" + name + "]";
	}
	
	
}
