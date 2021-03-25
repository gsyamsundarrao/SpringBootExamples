package com.springboot.model;

import javax.persistence.Column;

public class TableModelClass {
	
	String col1;
	String Col2;
	
	public String getCol1() {
		return col1;
	}
	
	@Column()
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return Col2;
	}
	
	@Column()
	public void setCol2(String col2) {
		Col2 = col2;
	}
	
	

}
