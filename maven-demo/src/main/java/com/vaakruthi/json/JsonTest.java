package com.vaakruthi.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String args[]) {
	JSONObject customer = new JSONObject();
	JSONArray arrayValues = new JSONArray();
	JSONObject customervalues1 = new JSONObject();
	JSONObject customervalues2 = new JSONObject();
	JSONObject customervalues3 = new JSONObject();
	
	
	customervalues1.put("name", "puja");
	customervalues1.put("accountnumber", "234567800");
	customervalues1.put("mobile", "8688859462");
	customervalues1.put("address", "hyd");
	
	
	customervalues2.put("name", "Gadde");
	customervalues2.put("accountnumber", "567893400");
	customervalues2.put("mobile", "9908431860");
	customervalues2.put("address", "ap");
	
	
	customervalues3.put("name", "prani");
	customervalues3.put("accountnumber", "789754400");
	customervalues3.put("mobile", "9907896432");
	customervalues3.put("address", "vijayawada");
	
	arrayValues.add(customervalues1);
	arrayValues.add(customervalues2);
	arrayValues.add(customervalues3);
	
	customer.put("customer", arrayValues);
	
	System.out.println("JSON Values:"+customer.toJSONString());
	//return customer.toJSONString();
}


}

