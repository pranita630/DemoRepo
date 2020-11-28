package com.pages;

import WebElementsAPI.WebElementFunctions;
import EnvironmentConstants.Constants;
import WebElementsAPI.BasePage;

public class RegistrationPage 
{
	WebElementFunctions Wf;
	Constants cn;
	BasePage bp;
	public RegistrationPage()
	{
		
		
	}
	public RegistrationPage(String BName)
	{
		cn=new Constants(); 
		cn.StartBrowser(BName);
		cn.EnterApplicationURL();
		Wf.CreateObjectRepository("RegistrationPage");	
	}
}
