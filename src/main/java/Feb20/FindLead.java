package Feb20;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.LoginLeaftaps;


public class FindLead extends LoginLeaftaps{

	@Test
	public void findLead() {
		
		//Click Leads
		clickByLink("Leads");

		//Find Leads
		clickByLink("Find Leads");
		
        enterById("ext-gen248", "ganesh");
        
        clickById("ext-gen334");
        
        clickByLink("ganesh");
		
 	
		
	}
	
}
