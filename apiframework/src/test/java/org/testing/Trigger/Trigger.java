package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1PostData;
import org.testing.TestScripts.TC2GetData;
import org.testing.TestScripts.TC3;

public class Trigger 
{
public static void main(String[] args) throws IOException 
{
	TC1PostData t=new TC1PostData();
	t.testcase1();
	
	TC2GetData t1=new TC2GetData();
	t1.testcase2();
	
	TC3 t2= new TC3();
	t2.testcase3();
}
}