package org.testing.Teststeps;

import java.util.Properties;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	public Response PostRequest(String uriKey,String body) 
	{
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(body)
			.when()
			.post(pr.getProperty(uriKey));
	
	return res;
}
	
	public Response GetRequest(String urikey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(urikey));
		
		return res;
	}
}