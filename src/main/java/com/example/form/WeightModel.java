package com.example.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class WeightModel extends BaseModel{
	@NotNull
	private Float val;
	
	@NotNull
	private Date date;
}
