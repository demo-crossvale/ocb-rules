package com.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Price implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "type")
	private java.lang.String type;
	@org.kie.api.definition.type.Label(value = "price")
	private java.lang.Double price;

	public Price() {
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public Price(java.lang.String type, java.lang.Double price) {
		this.type = type;
		this.price = price;
	}

}