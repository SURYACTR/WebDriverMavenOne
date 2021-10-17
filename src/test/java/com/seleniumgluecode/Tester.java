package com.seleniumgluecode;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tester {

	@Given("^I am a \"([a-zA-Z]{1,})\" Tester$")
	public void I_am_a_Manual_Tester(String testerType, DataTable table) {
	
	List<Map<String,String>>data=table.asMaps();
		
	System.out.println("---------------------");
	System.out.println("@Given -- I am a " +testerType+ " Tester"+" Current Location is "+data.get(0).get("Location")+" and Position is: "+data.get(0).get("Position"));
	System.out.println("@Given -- I am a " +testerType+ " Tester"+" Current Location is "+data.get(1).get("Location")+" and Position is: "+data.get(1).get("Position"));
	}
	@When("^I apply for a job$")
	public void I_apply_for_a_job() {
	System.out.println("@When --I apply for a job");	
		
	}
	
	@Then("^I get a \"([a-zA-Z]{1,})\" paid job$")
	public void I_get_less_paid_job(String salType) {
	System.out.println("@Then -- I get a " +salType+" paid job");	
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" satisfied with my salary$")
	public void I_am_not_satisfied_with_my_salary(String satType) {
	
	System.out.println("@And -- I am " +satType+ " satisfied with my salary");
		
	}
	
	@But("^My parents are \"([^\"]*)\" satisfied$")
	public void My_parents_are_still_satisfied(String parentSat) {
	
	System.out.println("@But -- My parents are " +parentSat+" satisfied");
	
	}
	
	
}
