package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "details about the contact")
public class Contact {

	@ApiModelProperty(notes = "Unique id of the contact")
	private String id;
	@ApiModelProperty(notes = "Name of the contact")
	private String name;
	@ApiModelProperty(notes = "Phone number of the contact")
	private String phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
