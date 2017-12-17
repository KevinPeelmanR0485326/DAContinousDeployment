package model;

import java.util.ArrayList;
import java.util.TreeMap;

public class Service {

	private ReviewDb db = new ReviewDb();
	
	public Service() {
		
	}
	
	public void addExample(String zip, Review r) {
		db.addExample(zip, r);
	}
	
	public TreeMap<String,ArrayList<Review>> getAllData(){
		return db.getAllData();
	}
	
	public ArrayList<Review> getData(String code){
		return db.getDataFrom(code);
	}

}
