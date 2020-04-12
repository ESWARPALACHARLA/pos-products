package com.test;

import java.util.Arrays;
import java.util.List;

public class Example {
	
	  public static String appendCP(String name){
		  return name.concat("CP");
	  }

	public static void main(String[] args) {
		appendCP("ESWAR");
	}
	public List<String> getItems(){
		return Arrays.asList("eswar");
	}
}
