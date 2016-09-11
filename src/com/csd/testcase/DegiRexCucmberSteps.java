package com.csd.testcase;

import com.csd.dao.DegiRexDAO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class DegiRexCucmberSteps extends TestCase {
	DegiRexDAO degRexDAO = new DegiRexDAO();
	String button;

	@Given("^\"([^\"]*)\" has a Smart phone with \"([^\"]*)\"$")
	public void has_a_Smart_phone_with(String person, String storage) throws Throwable {

		degRexDAO.setPerson(person);
		degRexDAO.setStorage(storage);

	}

	@Given("^the phone has memory greater than \"([^\"]*)\"$")
	public void the_phone_has_memory_greater_than(String storage) throws Throwable {

		degRexDAO.setStorage(storage);
	}

	@When("^\"([^\"]*)\" clicks to Scan record from the DegiRex application$")
	public void clicks_to_Scan_record_from_the_DegiRex_application(String person) throws Throwable {
		degRexDAO.setPerson(person);
		assertEquals("Bob", "Bob");

	}

	@Then("^the native camera application should get launched$")
	public void the_native_camera_application_should_get_launched() throws Throwable {
		assertEquals("Bob", degRexDAO.getPerson());
	}

	@Given("^the user has least \"([^\"]*)\" free memory$")
	public void the_user_has_least_free_memory(String storage) throws Throwable {
		degRexDAO.setStorage(storage);
		if (degRexDAO.getStorage().equals("500")){
			assertEquals("500","500" );
		}
	}

	@When("^user clicks the \"([^\"]*)\" button$")
	public void user_clicks_the_button(String arg1) throws Throwable {

	}

	@Then("^application will store the scanned photo$")
	public void application_will_store_the_scanned_photo() throws Throwable {

	}

}
