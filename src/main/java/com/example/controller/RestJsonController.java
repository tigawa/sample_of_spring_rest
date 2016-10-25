package com.example.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.BaseModel;

@RestController
@RequestMapping("/api/json")
public class RestJsonController {

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@Validated @RequestBody BaseModel model) {
		System.out.println("class=" + model.getBaseModel().getClass());
		System.out.println(model.getBaseModel());
	}
	
//	@ModelAttribute("model")
//	public BaseModel createModel(@RequestBody BaseModel model) {
//		switch (model.getKind()) {
//		case "height":
//			return new HeightModel();
//		case "weight":
//			return new WeightModel();
//		default:
//			throw new IllegalArgumentException("想定外のkindが入力されました。 kind="
//					+ model.getKind());
//		}
//	}
}
