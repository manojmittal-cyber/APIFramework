package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.Teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

public class TC2GetData 
{
	public void testcase2() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesFile("..../apiframework/Env.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.GetRequest("QA_URI",TC1PostData.idvalue);
	}
}