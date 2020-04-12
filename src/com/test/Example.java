package com.test;

public class Example {
	
	  public static String appendCP(String name){
		  return name.concat("CP");
	  }
	  public static String replaceSpecialCharacters(String name){
		  return name.replace("&", "&amp");
	  }
	public static void main(String[] args) {
		appendCP("ESWAR");
	}
}
