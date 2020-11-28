package com.pages;

import EnvironmentConstants.Constants;
import WebElementsAPI.BasePage;
import WebElementsAPI.WebElementFunctions;

public class SignInPage 
{
	WebElementFunctions Wf;
	Constants cn;
	BasePage bp;
	
	public SignInPage()
	{
		
		
	}
	public SignInPage(String BName)
	{
		
		//cn=new Constants(); 
		Wf=new WebElementFunctions();
		Wf.StartBrowser(BName);
		Wf.EnterApplicationURL();
		Wf.CreateObjectRepository("SignInPage");
		bp=new BasePage();
	}


	public void DoSignIn(String Email,String Password)
	{
		EnterUserName(Email);
		EnterPassword(Password);
		ClickSignInButton();
	}
	
	public void EnterUserName(String EmailField)
	{
		bp.EnterText(Wf.ObjectRepo.get("EmailField"),EmailField);
		
	}
	public void EnterPassword(String Pass)
	{
		
		bp.EnterText(Wf.ObjectRepo.get("PasswordField"),Pass);
	}
	
	public void ClickSignInButton()
	{
		bp.ClickElement(Wf.ObjectRepo.get("SignInbtn"));
		
	}
	
	public String GetWelcomePageTitle()
	{
		
		return bp.GetPageTitle();
	}

}
