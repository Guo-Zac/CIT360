package com.zacguo.test;

import java.util.*;

public class MvcModel {
	ArrayList<String> dataArray;
	
	public MvcModel(){
		dataArray = new ArrayList<String>(Arrays.asList("happiness", "fortune", "longevity"));
	}
	
	public void addString(String dataString){
		dataArray.add(dataString);
	}
	
	public ArrayList<String> getArrayOfStrings(){
		return dataArray;
	}
}
