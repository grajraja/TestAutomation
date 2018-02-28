package Feb20;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.LoginLeaftaps;

public class Duplicate extends LoginLeaftaps{
	
	@BeforeClass
	public void initialize() {
		excelFileName="duplicate";
	}
	
	
	  @Test(dataProvider="excelRead")
	public void duplicate(String cName, String fName, String lName) {
		
			//Click Leads
			clickByLink("Leads");

			//Find Leads
			clickByLink("Find Leads");
			
	        enterById("ext-gen248", "ganesh");
	        
	        clickById("ext-gen334");
	        
	        clickByLink("ganesh");
		
		clickByLink("Duplicate Lead");
		
        enterById("ext-createLeadForm_companyName", cName);
        enterById("ext-createLeadForm_firstName", fName);
        enterById("ext-createLeadForm_lastName", lName);
        getTextByXpath("//input[@value='Create Lead']");
               
				
		
		
	}

}
