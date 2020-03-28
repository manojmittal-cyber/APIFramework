package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseValidation 
{
	public static void responseStatusCodeValidation(int expectedstatuscode, Response res)
	{
		if(expectedstatuscode==res.statusCode())
		{
			System.out.println("Test Case Pass with Status code "+res.getStatusCode());
		}
		else 
		{
			System.out.println("Test case Failed with Status code "+res.getStatusCode());
		}
	}
}