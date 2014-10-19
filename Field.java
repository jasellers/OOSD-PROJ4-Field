package org.uiowa.cs2820.engine;

public class Field {
	public String FieldName = ""
	public String FieldValue = ""
	
	//constructor
	public Field(String n, String v) {
		FieldName = n
		FieldValue = v
	}
	public String getFieldName() {
		return FieldName;  
	}
	public String getFieldValue() {
		return FieldValue;
	}
}