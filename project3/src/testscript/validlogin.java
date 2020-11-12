package testscript;

import org.testng.annotations.Test;
import pom.actilogin;
import generic.basetest;
import generic.excelread;

public class validlogin extends basetest
{
	@Test
	public void valid_login()
	{
		String uname = excelread.getData("Sheet1",0,0);
		String pwd = excelread.getData("Sheet1",0,1);
		actilogin act=new actilogin(driver);
		act.setUsername(uname);
		act.setPassword(pwd);
		act.passBtn();
	//Assert.fail();
	}
}

