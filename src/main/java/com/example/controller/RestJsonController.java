package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.BaseModel;

@RestController
@RequestMapping("/api/json")
public class RestJsonController {

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@RequestBody BaseModel model) {
		System.out.println(model.getClass().getSimpleName());
		System.out.println(model);
	}
}
