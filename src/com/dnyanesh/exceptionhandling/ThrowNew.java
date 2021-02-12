package com.dnyanesh.exceptionhandling;

public class ThrowNew extends Throwable {
	public static void main(String[] args) {
		//throw new ThrowNew();
		try {
			throw new ThrowNew();
			//System.out.println("dake");
		} catch (ThrowNew exc) {
			System.out.println("Catched In ThrowNew");
			
		}catch (Exception e) {
			System.out.println("Catched in Exception");
			
		}catch (Throwable thro) {
			System.out.println("Catched in Throwable");
			
		}
	}
}
