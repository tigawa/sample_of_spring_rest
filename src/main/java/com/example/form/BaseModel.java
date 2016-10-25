package com.example.form;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.validation.Valid;

import lombok.Data;

import com.fasterxml.jackson.databind.ObjectMapper;

@Data
public class BaseModel {
	private String kind;
	private Map<String,?> data;
	@Valid
	private BaseModel baseModel;
	
	public void setData(Map<String,?> data) throws IllegalAccessException, InvocationTargetException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(data);
        System.out.println("json:" + json);
        baseModel = mapper.readValue(json, WeightModel.class);	
	}	
}
