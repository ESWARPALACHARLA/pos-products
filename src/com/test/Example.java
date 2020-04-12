package com.test;

import java.util.Arrays;
import java.util.List;


public class Example {
	
	  public static String appendCP(String name){
		  return name.concat("CP");
	  }

	
	public List<String> getItems(){
		return Arrays.asList("eswar");
	}
	  public static String replaceSpecialCharacters(String name){
		  return name.replace("&", "&amp");
	  }
	public static void main(String[] args) {
		appendCP("ESWAR");
	}

}
