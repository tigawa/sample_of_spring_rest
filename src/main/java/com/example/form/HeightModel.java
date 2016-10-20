package com.example.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class HeightModel extends BaseModel{
	
	@NotNull
	private int val;
	
	@NotNull
	private Date date;
}
