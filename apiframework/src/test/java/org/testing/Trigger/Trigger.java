package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1PostData;
import org.testing.TestScripts.TC2GetData;

public class Trigger 
{
public static void main(String[] args) throws IOException 
{
	TC1PostData t=new TC1PostData();
	t.testcase1();
	
	TC2GetData t1=new TC2GetData();
	t1.testcase2();
}
}