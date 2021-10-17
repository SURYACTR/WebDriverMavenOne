package com.seleniumgluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Developer {
	
	@Given("^I am a \"([a-zA-Z]{1,})\" Developer$")
	public void I_am_a_CoreJava_Developer(String devType) {
	System.out.println("---------------------");
	System.out.println("@Given -- I am a " +devType+ " Developer");
		
	}
	@When("^I started development$")
	public void I_started_development() {
	System.out.println("@When --I started development");	
		
	}
	
	@Then("^I created a \"([a-zA-Z]{1,})\" java program$")
	public void I_created_a_simple_java_program(String progType) {
	System.out.println("@Then -- I get a " +progType+" paid job");	
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" experienced$")
	public void i_am_not_experienced(String expType) {
	
	System.out.println("@And -- I am " +expType+ " experienced");
		
	}
	
	@But("^My Boss is \"([^\"]*)\" satisfied$")
	public void my_Boss_is_still_satisfied(String satisType) {
	
	System.out.println("@But -- My parents are " +satisType+" satisfied");
	
	}

}
