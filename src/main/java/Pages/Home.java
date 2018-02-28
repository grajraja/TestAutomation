package Pages;

import wrappers.SeMethods;

public class Home extends SeMethods{
	
	public MyHome clickCRMSFA(String username) {
		
		clickByLink("CRM/SFA");
		return new MyHome();
	}

}
