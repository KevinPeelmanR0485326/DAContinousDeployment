package model;

import java.util.ArrayList;
import java.util.TreeMap;

public interface DbInterface {

	public void addExample(String zip, Review e);
	public ArrayList<Review> getDataFrom(String c);
	public TreeMap<String,ArrayList<Review>> getAllData();
}
