package com.neutrino.model;

public enum Region {
	A1("Asia"),
	B1("Europe"),
	C1("Africa"),
	D1("Oceania"),
	E1("North America"),
	F1("South America");
	
	private final String description;

	/*
	 * Enum mechanism 을 통해 접근 가능하므로 Private
	 */
	private Region(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
