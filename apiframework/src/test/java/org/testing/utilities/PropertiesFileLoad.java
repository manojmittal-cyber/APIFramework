package org.testing.utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad 
{
	public static Properties propertiesFile(String filePath) throws IOException
	{
		File f=new File(filePath);
		FileInputStream f1=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(f1);		
		return pr;
	}
}