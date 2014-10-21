package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;
import org.junit.Test;

public class FieldTest {

	Field Testme = new Field("TestName","TestValue");
	
	@Test
	public void test0(){
	String a = Testme.getFieldName();
	assertEquals(a,"TestName");
	}
	
	@Test
	public void test1(){
	String b = Testme.getFieldValue();
	assertEquals(b,"TestValue");
	}
}
