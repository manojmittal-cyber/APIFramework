package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.Teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseDataPasingUsingJsonPath;

import com.jayway.restassured.response.Response;

//TC1 is for Post Request
public class TC1PostData 
{
	static String idvalue;
	
public static void main(String[] args) throws IOException 
{
	JSONObject data=new JSONObject();
	data.put("Firstname","Akshmittal");
	data.put("id","Akshimittal2");
		
	Properties pr=PropertiesFileLoad.propertiesFile("../apiframework/Env.properties");
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.PostRequest("QA_URI",data.toString());
	//System.out.println(res.getStatusCode());
	//System.out.println(res.asString());
	
	ResponseValidation.responseStatusCodeValidation(201, res);
	idvalue=ResponseDataPasingUsingJsonPath.response_parsing(res, "id");
	System.out.println("id value is "+idvalue);
}
}