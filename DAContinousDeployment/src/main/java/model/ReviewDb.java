package model;

import java.util.ArrayList;
import java.util.TreeMap;

public class ReviewDb implements DbInterface{
	
	public TreeMap<String, ArrayList<Review>> map = new TreeMap<>();
	
	public ReviewDb() {
		
	}
	
	public void addExample(String zip, Review e) {
		if(!map.containsKey(zip)) {
			map.put(zip, new ArrayList<Review>());
		}
		map.get(zip).add(e);
	}
	
	public ArrayList<Review> getDataFrom(String c) {
		return map.get(c);
	}
	
	public TreeMap<String,ArrayList<Review>> getAllData(){
		return map;
	}
}
