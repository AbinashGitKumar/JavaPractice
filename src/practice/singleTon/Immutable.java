package practice.singleTon;

import java.util.HashMap;

public final class Immutable {

	private final String prop1;
	
	/**
	 * Mutable property should not be directly returned but clone of the mutable
	 * object should be returned.
	 */
	private final HashMap<Integer,String> map; //mutable member variable

	
	public Immutable(String property,HashMap<Integer,String> map)
	{
		this.prop1=property;
		this.map=map;
	}
	
	
	public String getProp1() {
		return prop1;
	}

	public HashMap<Integer, String> getMap() {
		return (HashMap<Integer, String>) map.clone();
	}
	
}
