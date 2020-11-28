package com.pages;

import EnvironmentConstants.Constants;
import WebElementsAPI.BasePage;
import WebElementsAPI.WebElementFunctions;

public class HomePage 
{
	WebElementFunctions Wf;
	Constants cn;
	BasePage bp;
	
	public HomePage()
	{
		
		
	}
	
	public HomePage(String BName)
	{
		cn=new Constants(); 
		cn.StartBrowser(BName);
		cn.EnterApplicationURL();
		Wf.CreateObjectRepository("HomePage");
	}
	
	
}
