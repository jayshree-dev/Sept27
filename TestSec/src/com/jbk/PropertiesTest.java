package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	public static void main(String[] args) throws Exception {
	
	FileInputStream istream=new FileInputStream("D:\\login.properies");
	Properties prop=new Properties();
	prop.load(istream);
	prop.getProperty("username");
	
	
	
	}}