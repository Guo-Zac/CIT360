package com.zacguo.test;

import java.util.*;

/*
 * Models operate on Data, either gives put/get public methods or connect to Databases to save data.
 */
public class MvcModel {
	ArrayList<String> dataArray;
	int listSize = 5;
	/*
	 * Give this model an initial data set
	 */
	public MvcModel(){
		dataArray = new ArrayList<String>(Arrays.asList("happiness", "fortune", "longevity"));
	}
	
	/*
	 * put method to update model
	 */
	public void addString(String dataString){
		dataArray.add(dataString);
	}
	
	/*
	 * get method to return model array
	 */
	public ArrayList<String> getArrayOfStrings(){
		return dataArray;
	}
	
	/*
	 * add a rule of model array size limit
	 */
	public boolean isNotFull(){
		if(dataArray.size()<5){
			return true;
		}
		else{
			return false;
		}
	}
}
