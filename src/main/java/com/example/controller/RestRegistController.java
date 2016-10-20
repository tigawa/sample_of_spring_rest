package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.WeightModel;

@RestController
@RequestMapping("/api")
public class RestRegistController{
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(@RequestBody WeightModel model) {
		System.out.println(model.getClass().getSimpleName());
		System.out.println(model);
	}
}
