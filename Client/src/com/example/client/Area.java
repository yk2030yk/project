package com.example.client;

import java.io.Serializable;
import java.util.ArrayList;

//implements Serializableはintentでの受け渡しに必要
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;
	public String prefName = null;
	public String prefId = null;
	public ArrayList<LargeArea> largeAreas = new ArrayList<LargeArea>();

	public Area(String name, String id) {
		this.prefName = name;
		this.prefId = id;
	}

	public void addLarge(String name, String id) {
		largeAreas.add(new LargeArea(name, id));
	}

}
