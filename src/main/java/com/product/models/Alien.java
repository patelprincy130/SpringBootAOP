package com.product.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Id
	private int id;
	private String aname;

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + "]";
	}

}
