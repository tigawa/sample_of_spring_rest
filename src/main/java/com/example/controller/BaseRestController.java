package com.example.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.form.BaseModel;
import com.example.form.HeightModel;
import com.example.form.WeightModel;

public abstract class BaseRestController {
	
	
	@ModelAttribute("model")
	public BaseModel createModel(@ModelAttribute BaseModel model){
		
		switch (model.getKind()) {
		case "height":
			return new HeightModel();

		case "weight":
			return new WeightModel();

		default:
			return model;
		}		
	}

}
