package com.nikhil;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaBasics {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = originalFormat.parse("1561554154352");
		System.out.println(date);
	}

}
