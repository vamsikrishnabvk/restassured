package com.info.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class Utildata {
	public static String namee()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(2);
		return("vamsi"+generatedstring);
	}
    public static String locationn()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(6);
    	return(generatedstring);
    }
    public static String phonee()
    {
    	String generatedstring=RandomStringUtils.randomNumeric(8);
    	return generatedstring;
    }
    public static String coursee()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(1);
    	return(generatedstring);
    }
    
}
