package Feb20;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tests.LoginLeaftaps;

public class CreateLead extends LoginLeaftaps{
	
	@BeforeClass
	public void initialize() {
		excelFileName="create";
	}
	
	  @Test(dataProvider="excelRead")
	public void createLead(String cName, String fName, String lName) {
		
		//Click Leads
		clickByLink("Leads");

		//Create Leads
		clickByLink("Create Lead");
		
		//Enter Company Name
		enterById("createLeadForm_companyName", cName);
		
		//Enter Company Name
		enterById("createLeadForm_firstName", fName);
		
		//Enter Company Name
		enterById("createLeadForm_lastName", lName);				

		//createLeadForm_dataSourceId
		selectIndexById("createLeadForm_dataSourceId", 2);
		
		//Submit
		clickByClassName("smallSubmit");
	}
	

}
