package com.example.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.BaseModel;
import com.example.form.HeightModel;
import com.example.form.WeightModel;

@RestController
@RequestMapping("/api/form")
public class RestFormController {

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@ModelAttribute("model") BaseModel model) {
		System.out.println("class=" + model.getClass().getSimpleName());
		System.out.println(model);
	}

	@ModelAttribute("model")
	public BaseModel createModel(@ModelAttribute BaseModel model) {
		switch (model.getKind()) {
		case "height":
			return new HeightModel();
		case "weight":
			return new WeightModel();
		default:
			throw new IllegalArgumentException("想定外のkindが入力されました。 kind="
					+ model.getKind());
		}
	}
}
