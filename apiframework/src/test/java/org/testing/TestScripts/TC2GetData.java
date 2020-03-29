package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.Teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class TC2GetData 
{
	public void testcase2() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesFile("../apiframework/Env.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequest("QA_URI",TC1PostData.idvalue);
		
		System.out.println("Status code is "+res.getStatusCode());
		System.out.println("Data is");
		System.out.println(res.asString());
	}
}