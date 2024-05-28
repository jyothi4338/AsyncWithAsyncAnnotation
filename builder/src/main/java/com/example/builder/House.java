package com.example.builder;

public class House {
private String name;
private String ownHouse;
private String owner;


public House(String name, String ownHouse, String owner) {
	this.name = name;
	this.ownHouse = ownHouse;
	this.owner = owner;
}

public String getOwnHouse() {
	return ownHouse;
}
public String getOwner() {
	return owner;
}
public String getName() {
	return name;
}
public static class HouseBuilder{
	private String name;
	private String ownHouse;
	private String owner;
	
	public HouseBuilder name(String name) {
		this.name = name;
		return this;
	}
	public HouseBuilder ownHouse(String ownHouse) {
		this.ownHouse = ownHouse;
		return this;
	}
	
	public HouseBuilder owner(String owner) {
		this.owner = owner;
		return this;
	}
	
	public House build() {
		return new House(name, ownHouse, owner);
	}
}

}
