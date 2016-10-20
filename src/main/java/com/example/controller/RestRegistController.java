package com.example.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.BaseModel;

@RestController
@RequestMapping("/api")
public class RestRegistController extends BaseRestController{
	
	@RequestMapping(value="/save_form", method=RequestMethod.POST)
	public void saveForm(@ModelAttribute("model") BaseModel model) {
		System.out.println(model.getClass().getSimpleName());
		System.out.println(model);
	}
	
	@RequestMapping(value="/save_json", method=RequestMethod.POST)
	public void saveJson(@RequestBody BaseModel model) {
		System.out.println(model.getClass().getSimpleName());
		System.out.println(model);
	}
}
