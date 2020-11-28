package com.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.SignInPage;

import Utilities.Utiles;

public class SignInPageTestCase 
{
	// TODO Auto-generated method stub
			/*
			 	1.Enter "mercury" in UserNamke field
			 	2.Enter "mercury" in password field
			 	3.Click SignIn button
			 	4.See "Welcome" title page appears on screen
			 */
	SignInPage sp;
		
		@BeforeClass	
		@Parameters({"BrowserToExecuteTestOn"})
		public void Init(String Browser)
		{
				Utiles.InitialiseEnvVars();
				sp=new SignInPage(Browser);
		}		
				
		@Test(priority=1)
		@Parameters({"UserName","Password"})
		public void ValidCredentials(String U,String P)
		{
			sp.DoSignIn(U, P);
			//String title=sp.GetWelcomePageTitle();
			//Assert.assertEquals(title, "Sign In to your PaperTrue Account | PaperTrue");
			
		}	
		
		
	

}
