package test;

import java.io.UnsupportedEncodingException;

public class Character {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String dd = "���¾߸�";		
		byte[] a = dd.getBytes("iso-8859-1");
		String b = new String(a, "latin1");
		String c = new String(a,"iso-8859-2");

		System.out.println(">> "+ b);		
		System.out.println(">> "+ c);
				
	
	}

}