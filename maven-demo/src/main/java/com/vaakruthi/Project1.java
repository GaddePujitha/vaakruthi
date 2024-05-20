package com.vaakruthi;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/Project1")

public class Project1 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String lat= req.getParameter("lat");
		String lon= req.getParameter("lon");
		
		JSONObject weather =new JSONObject();
		JSONArray arrayValues = new JSONArray();
		
	    JSONObject weatherObject = new JSONObject();
	    weatherObject.put("id", 804);
	    weatherObject.put("main", "Clouds");
	    weatherObject.put("description", "overcast clouds");
	    weatherObject.put("icon", 04d);
	    
	    arrayValues.add(weatherObject);
	    
	    weather.put("weather", arrayValues);
	    
	    JSONObject coord = new JSONObject();
	    coord.put("lon",lon);
	    coord.put("lat",lat);
	    weather.put("coord", coord);
	    
	    System.out.println("JSON Values : "+weather.toJSONString());
	    
	    resp.setContentType("application/json");
	    resp.getWriter().print(weather);
	}

		
	}

