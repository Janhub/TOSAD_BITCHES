package com.example.jersey.domain;

public class AttributeRule implements BusinessRuleComponent<AttributeRule>{

	private String attribute;
	
	public AttributeRule(String attribute) {
		this.attribute = attribute;
	}
	
	public String getAttribute() {
		return this.attribute;
	}

	@Override
	public String getComponentName() {
		// - decorator for matching the right businessrule name 
		/* 
		 * Must haves: 
		Attribute compare rule 
		Attribute range rule
		 * Should haves
		Attibrute List Rule
		*/
		return "attribute";
	}
}