package com.monocept.reflectest;
import java.lang.reflect.*;
class Student{
	public void details(){
		
	}
	public String type;
}

public class displayFieldMethod {
	public static void main(String[] args) {
			  Student s = new Student();
			  Class obj = s.getClass();
			  String name = obj.getName();
			  System.out.println("Class Name: " +name);
			  Class exp = Class.class;
				try {
			  Field field1 = obj.getField("type");
			  field1.set(obj, "xyz");
		      String typeValue = (String) field1.get(s);
		      System.out.println("Value: " + typeValue);
		      
				Method[] methods = obj.getDeclaredMethods();

			      for (Method m : methods) {
			        // get names of methods
			        System.out.println("Method Name: " + m.getName());
			        System.out.println(" ");
			      }
			  }
	catch (Exception e) {
	      e.printStackTrace();
	    }

	}
}
