package com.crm.PRACTICE;

import org.testng.annotations.Test;

public class DebugPractice 
{
@Test
public void demo()
{
System.out.println("Demo");	
DebugPractice d=new DebugPractice();
d.div(1, 0);
}

public int div(int a, int b)
{
int c=a/b;
return c;
}
}
