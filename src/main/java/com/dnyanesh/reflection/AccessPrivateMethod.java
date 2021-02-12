package com.dake.reflection;

import java.lang.reflect.Method;

import org.omg.CORBA.Object;

public class AccessPrivateMethod {
	public static void main(String[] args) throws Exception, Exception {
		try {
			Class c = Class.forName("Sample");
			java.lang.Object o = c.newInstance();
			Method[] m = c.getDeclaredMethods();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}